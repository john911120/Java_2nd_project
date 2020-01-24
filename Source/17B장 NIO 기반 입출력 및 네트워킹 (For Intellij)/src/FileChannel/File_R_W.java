package FileChannel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

    /*
        파일 생성 및 파일을 쓰는 예제
        - FileChannel의 write()메소드를 호출하여서
        - 매개값으로 ByteBuffer객체를 주면 된다.
        - ByteBuffer의 Position에서 부터 limit까지이다.
        - position이 0이고 capacity와 동일하다면 ByteBuffer의 모든 바이트가 파일에 쓰여진다.
        - 작성일 : 0122
     */

public class File_R_W {
        public static void main(String[] args) throws Exception {
            Path path = Paths.get("C:/Temp/file.txt");
            Files.createDirectories(path.getParent());

            // FileChannel을 만든다.
            FileChannel fileChannel = FileChannel.open(
                    path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            // file.txt에 입력될 문자열을 입력한다.
            String data = "Opera of The Wasteland";
            Charset charset = Charset.defaultCharset();
            ByteBuffer byteBuffer = charset.encode(data);

            // 파일에 데이터 쓰기
            int byteCount = fileChannel.write(byteBuffer);
            System.out.println("file.txt : " + byteBuffer + " byte written");

            fileChannel.close();
        }
}
