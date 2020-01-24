package TCPAsynchronizedFileChannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
        비동기로 파일 읽는 예제 작성
        - 작성일 : 0122
    */
public class AsynchronousFileChannelReadExample {
    public static void main(String[] args)throws Exception {
        // 스레드풀 생성하기
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        for (int i = 0; i < 10; i++) {
            Path path = Paths.get("C:/Temp/file" + i + ".txt");
            Files.createDirectories(path.getParent());

            // 비동기 파일 채널 만들기
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(
                    path, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.READ),
                    executorService);

            // 파일의 크기와 동일한 capacity를 가지는 버퍼를 만든다.
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) fileChannel.size());

            // 첨부 객체 생성(파일 경로를 저장하고 비동기 파일 채널을 저장하고 읽은 데이터를 저장할 버퍼를 추가한다.)
            class Attachment {
                Path path;
                AsynchronousFileChannel fileChannel;
                ByteBuffer byteBuffer;
            }
            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;
            attachment.byteBuffer = byteBuffer;

            // CompletionHandler 객체 만들기
            CompletionHandler<Integer, Attachment> completionHandlernew =
                    new CompletionHandler<Integer, Attachment>() {
                        @Override
                        public void completed(Integer result, Attachment attachment) {
                            attachment.byteBuffer.flip();
                            //버퍼에 저장된 데이터를 문자열로 복원하기
                            Charset charset = Charset.defaultCharset();
                            String data = charset.decode(attachment.byteBuffer).toString();

                            System.out.println(attachment.path.getFileName() + " : " + data + ":" +
                                    Thread.currentThread().getName());
                            try {
                                fileChannel.close();
                            } catch (IOException e) { }
                        }

                        @Override
                        public void failed(Throwable exc, Attachment attachment) {
                            exc.printStackTrace();
                            try {
                                fileChannel.close();
                            } catch (IOException e) {
                            }
                        }
                    };
            // 버퍼 객체와 인덱스, 첨부 객체, 콜백 메소드를 가진 객체를 파일에 쓴다.
            fileChannel.read(byteBuffer, 0, attachment, completionHandlernew);
        }
        // 스레드 풀 종료
        executorService.shutdown();
    }
}

