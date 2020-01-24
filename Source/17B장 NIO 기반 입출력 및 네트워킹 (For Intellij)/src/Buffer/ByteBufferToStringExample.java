package Buffer;

/*
    ByteBuffer <-> String
    - 문자열을 UTF-8으로 인코딩해서 얻은 ByteBuffer를 다시 UTF-8으로 디코딩 해서 문자열으로
      복원시킨다.
    - 작성일 : 0120
 */

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteBufferToStringExample {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");

        // 문자열 -> 인코딩 -> ByteBuffer
        String data = "Hello";
        ByteBuffer byteBuffer = charset.encode(data);

        // ByteBuffer -> 디코딩 -> CharBuffer -> 문자열
        data = charset.decode(byteBuffer).toString();
        System.out.println("문자열 복원 : " + data);
    }
}
