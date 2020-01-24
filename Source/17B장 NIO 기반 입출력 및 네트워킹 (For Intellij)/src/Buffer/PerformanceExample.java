package Buffer;

/*
    넌다이렉트 버퍼와 다이렉트 버퍼의 성능 테스트 결과를 출력한다.
    - 이미지 3개를 준비한다.
    - 이미지 3개를 100번 복사하는데 걸리는 시간을 측정한다.
    - 넌다이렉트 버퍼와 다이렉트 버퍼를 만든다.
    - 넌다이렉트 버퍼 테스트와 파일의 위치를 0으로 설정한다.
    - 다이렉트 버퍼 테스트를 실행하는 코드 작성
    작성일 : 0120
 */

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceExample {
    public static void main(String[] args) throws Exception {
        Path from = Paths.get("src/Buffer/image/8637041i.png");
        Path to1 = Paths.get("src/Buffer/image/1425895760.jpg");
        Path to2 = Paths.get("src/Buffer/image/HONOKA01.jpg");

        long size = Files.size(from);

        FileChannel fileChannel_from = FileChannel.open(from);
        FileChannel fileChannel_to1 = FileChannel.open(to1,
                EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
        FileChannel fileChannel_to2 = FileChannel.open(to2,
                EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate((int) size);
        ByteBuffer directBuffer = ByteBuffer.allocateDirect((int) size);

        long start, end;

        start = System.nanoTime();
        for(int i = 0; i<100; i++){
            fileChannel_from.read(nonDirectBuffer);
            nonDirectBuffer.flip();
            fileChannel_to1.write(nonDirectBuffer);
            nonDirectBuffer.clear();
        }
        end = System.nanoTime();
        System.out.println("넌다이렉트:\t" + (end-start) + "ns");

        fileChannel_from.position(0);

        start = System.nanoTime();
        for(int i = 0; i<100; i++){
            fileChannel_from.read(directBuffer);
            directBuffer.flip();
            fileChannel_to1.write(directBuffer);
            directBuffer.clear();
        }
        end = System.nanoTime();
        System.out.println("다이렉트:\t" + (end-start) + "ns");

        fileChannel_from.close();
        fileChannel_to1.close();
        fileChannel_to2.close();
    }
}
