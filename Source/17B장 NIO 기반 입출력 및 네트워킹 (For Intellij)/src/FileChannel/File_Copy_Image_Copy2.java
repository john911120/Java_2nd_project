package FileChannel;

    /*
        File클래스의 copy()메소드를 사용해서 이미지 파일을 복사해보자
        - 단순하게 파일을 복사만 할 목적이라면 NIO의 파일 클래스의 copy()를 사용하는것이 좋다.
        - 첫번째 source매개값에는 원본 파일의 Path객체를 저장하고
        - 두번째 target매개값에는 타겟 파일의 Path객체를 지정하면되고
        - 세번째 매개값은 StandardCopyOption열거 상수를 목적에 맞게 나열해주면 된다.
        - 작성일 : 0122
     */

import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class File_Copy_Image_Copy2 {
    public static void main(String[] args) throws IOException {
        Path from = Paths.get("src/FileChannel/Image/8637041i.png");
        Path to = Paths.get("src/FileChannel/Image/HONOKA01.jpg");

        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Image File Copy Success");
    }
}
