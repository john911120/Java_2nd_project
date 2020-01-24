package FileChannel;

    /*
        FileChannel을 이용해서 이미지 파일을 복사하는 예제
        - 크기가 100인 다이렉트 버퍼를 만들었다.
        - 채널에서 읽고 다시 채널로 쓰는 경우 다이렉트 버퍼가 좋은 성능을 내기 때문이다.
        - 작성일 : 0122
     */

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_Copy_Image_Copy {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("src/FileChannel/Image/8637041i.png");
        Path to = Paths.get("src/FileChannel/Image/HONOKA01.jpg");

        // 읽기 FileChannel 만들기
        FileChannel fileChannel_from = FileChannel.open(
                from, StandardOpenOption.READ);

        // 쓰기 FileChannel 생성
        FileChannel fileChannel_to = FileChannel.open(
                to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
        int byteCount;
        while(true) {
            buffer.clear();
            byteCount = fileChannel_from.read(buffer); // 파일을 읽는 기능
            if(byteCount == -1) break;
            buffer.flip();
            fileChannel_to.write(buffer); // 파일을 쓰는 기능
            }

        fileChannel_from.close();
        fileChannel_to.close();
        System.out.println("Image File Copy Success");
    }
}
