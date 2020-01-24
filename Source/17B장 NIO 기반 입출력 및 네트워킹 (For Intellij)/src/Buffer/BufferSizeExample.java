package Buffer;

/*
    200MB 크기의 버퍼를 생성하려 했으나 다이렉트 버버는 정상 출력되는 반면에
    넌다이렉트 버퍼는 OutOFMemory를 발생한다.
    - 컴퓨터의 성능과 현 상태에 따라 버퍼의 크기는 유동적이다. 크기 조정을 하며 테스트하자.
    - 작성일 : 0120
 */

import java.nio.ByteBuffer;

public class BufferSizeExample {
    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(200 * 1024 * 1024);
        System.out.println("다이렉트 버퍼가 생성되었습니다.");

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate(1024 * 1024 * 1024);
        System.out.println("넌다이렉트 버퍼가 생성되었습니다.");
    }
}
