package File_Directory;

    /*
        워치 서비스
        - WatchServiceThread 클래스를 선언한다.
        - c:\Temp 디렉토리에 WatchService를 등록한다.
        - WatchServiceThread 생성 및 시작한다.
        작성일 : 0120
     */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.nio.file.WatchEvent.Kind;

import java.nio.file.*;
import java.util.List;

public class WatchServiceExample extends Application {
    class WatchServiceThread extends Thread{
        @Override
        public void run() {
            try{
                WatchService watchService = FileSystems.getDefault().newWatchService();
                Path directory = Paths.get("C:/Temp");
                directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                                                 StandardWatchEventKinds.ENTRY_DELETE,
                                                 StandardWatchEventKinds.ENTRY_MODIFY);
                while(true) {
                    WatchKey watchKey = watchService.take(); // WatchKey가 큐에 들어올 때 까지
                    List<WatchEvent<?>> list = watchKey.pollEvents(); // WatchEvent 목록 얻기
                    for(WatchEvent watchEvent : list) {
                        // 이벤트 종류를 얻어오기
                        Kind kind = watchEvent.kind();
                        // 감지된 Path를 얻는다.
                        Path path = (Path) watchEvent.context();
                        if(kind == StandardWatchEventKinds.ENTRY_CREATE){
                            // 생성이 되면 실행되는 코드
                            Platform.runLater(()->textArea.appendText("파일 생성됨 ->" + path.getFileName() + "\n"));
                        } else if(kind == StandardWatchEventKinds.ENTRY_DELETE){
                            // 삭제 되었으면 실행되는 코드
                            Platform.runLater(()->textArea.appendText("파일 삭제됨 -> " + path.getFileName() + "\n"));
                        } else if(kind == StandardWatchEventKinds.ENTRY_MODIFY){
                            // 변경이 되었으면 실행되는 코드
                            Platform.runLater(()->textArea.appendText("파일 변경됨 -> " + path.getFileName() + "\n"));
                        } else if(kind == StandardWatchEventKinds.OVERFLOW) {
                        }
                    }
                    boolean valid = watchKey.reset();
                    if(!valid) {break;}
                }
            } catch(Exception e) {}
        }
    }
    TextArea textArea;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPrefSize(500, 300);

        textArea = new TextArea();
        textArea.setEditable(false);
        root.setCenter(textArea);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("WatchServiceExample");
        primaryStage.show();

        WatchServiceThread wst = new WatchServiceThread();
        wst.start();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
