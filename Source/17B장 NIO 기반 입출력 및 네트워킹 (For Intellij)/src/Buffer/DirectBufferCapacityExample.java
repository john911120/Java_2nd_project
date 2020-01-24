package Buffer;

/*
    100개의 byte를 저장하는 다이렉트 ByteBuffer와 50개의 문자를 저장하는 다이렉트
    CharBuffer, 25개의 정수를 저장하는 다이렉트 IntBuffer를 생성하는 코드를 만든다.
    char는 2바이트의 크기를 가지고 int는 4바이트의 크기를 가진다.
    작성일 : 0120
 */

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferCapacityExample {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        System.out.println("저장용량 : " + byteBuffer.capacity() + "Byte");

        CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
        System.out.println("저장용량 : " + charBuffer.capacity() + "문자");

        IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
        System.out.println("저장용량 : " + intBuffer.capacity() + "정수");
    }
}
