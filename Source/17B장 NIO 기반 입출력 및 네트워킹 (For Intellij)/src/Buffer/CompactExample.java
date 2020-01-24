package Buffer;

    /*
        compact()메소드 호출 후 변경된 버퍼의 내용과 position, limit의 위치를 보여준다.
        - 데이터를 읽기 위해 위치 속성값을 변경한다.
        - 읽지 않은 데이터는 인덱스로부터 복사하도록 설정한다.
        작성일 : 0120
     */

import java.nio.ByteBuffer;


public class CompactExample {
    public static void main(String[] args) {
        System.out.println("[7Byte 크기로 버퍼를 만든다.]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        buffer.put((byte) 10);
        buffer.put((byte) 11);
        buffer.put((byte) 12);
        buffer.put((byte) 13);
        buffer.put((byte) 14);
        buffer.flip();
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("[3Byte 읽음]");

        buffer.compact();
        System.out.println("[compact() 실행 후]");
        printState(buffer);
    }

    public static void printState(ByteBuffer buffer){
        System.out.print(buffer.get(0) + ",");
        System.out.print(buffer.get(1) + ",");
        System.out.print(buffer.get(2) + ",");
        System.out.print(buffer.get(3) + ",");
        System.out.println(buffer.get(4));
        System.out.print("position :" + buffer.position() + ", ");
        System.out.print("limit : " + buffer.limit() + ", ");
        System.out.println("capacity : " + buffer.capacity());
    }
}
