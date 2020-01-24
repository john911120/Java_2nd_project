package FileChannel;

    /*
        파일을 읽는 예제
        - read()메소드를 호출하여서
        - 매개값으로 ByteBuffer를 호출하면 되는데 파일에서 읽혀지는 바이트는 ByteBuffer의
          position으로 부터 저장된다.
        - 0이면 ByteBuffer의 첫 바이트부터 저장이된다. read()의 리턴값은 파일에서 ByteBuffer으로 읽혀진 바이트 수이다.
        - 한 번 읽을 수 있는 최대 바이트 수는 ByteBuffer의 capacity까지 리턴되는 최대값은 capacity가 된다.
        - 더이상 읽을 바이트가 없다면 -1을 리턴한다.
        - 1바이트를 저장할 때마다 position이 1씩 증가하는데 read()가 -1을 리턴할 때까지 버퍼에 저장한 마지막 바이트 위치는
          position-1인덱스이다.
        - 작성일 : 0122
     */

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_Read {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/temp/file.txt");

        // FileChannel을 만든다.
        FileChannel fileChannel = FileChannel.open(
                path, StandardOpenOption.READ);

        ByteBuffer byteBuffer = ByteBuffer.allocate(100);

        Charset charset = Charset.defaultCharset();
        String data = "";
        int byteCount;

        while(true){
            // 파일으로부터 데이터를 읽어온다.
            byteCount = fileChannel.read(byteBuffer);
            if(byteCount == -1) break;
            byteBuffer.flip();
            data += charset.decode(byteBuffer).toString();
            byteBuffer.clear();
        }

        fileChannel.close();
        System.out.println("file.txt : " + data);
    }
}
