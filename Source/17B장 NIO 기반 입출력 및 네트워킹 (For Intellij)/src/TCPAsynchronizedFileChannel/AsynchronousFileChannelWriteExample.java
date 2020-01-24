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
        비동기로 파일 생성 및 파일 쓰는 예제 작성
        - 작성일 : 0122
    */
public class AsynchronousFileChannelWriteExample {
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
                    path, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE),
                    executorService);

            // 파일에 저장할 데이터를 ByteBuffer에 저장한다.
            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = charset.encode("내가 고자라니");

            // 첨부 객체 생성(파일 경로를 저장하고 비동기 파일 채널을 저장한다.)
            class Attachment {
                Path path;
                AsynchronousFileChannel fileChannel;
            }
            Attachment attachment = new Attachment();
            attachment.path = path;
            attachment.fileChannel = fileChannel;

            // CompletionHandler 객체 만들기
            CompletionHandler<Integer, Attachment> completionHandler =
                    new CompletionHandler<Integer, Attachment>() {
                        @Override
                        public void completed(Integer result, Attachment attachment) {
                            System.out.println(attachment.path.getFileName() + " : " + result +
                                    "bytes written : " + Thread.currentThread().getName());
                            try {
                                attachment.fileChannel.close();
                            } catch (IOException e) {
                            }
                        }

                        @Override
                        public void failed(Throwable exc, Attachment attachment) {
                            exc.printStackTrace();
                            try {
                                attachment.fileChannel.close();
                            } catch (IOException e) {
                            }
                        }
                    };
            // 버퍼 객체와 인덱스, 첨부 객체, 콜백 메소드를 가진 객체를 파일에 쓴다.
            fileChannel.write(byteBuffer, 0, attachment, completionHandler);
        }
        // 스레드 풀 종료
        Thread.sleep(1000);
        executorService.shutdown();
    }
}

