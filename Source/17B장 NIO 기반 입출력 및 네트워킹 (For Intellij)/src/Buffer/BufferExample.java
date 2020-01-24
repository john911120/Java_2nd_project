package Buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/*
    버퍼의 위치 속성값
    - 다이렉트 버퍼를 만든다음 상대적 저장을 한다.
    - 데이터를 읽기 위해 위치 속성값을 변경을 해주고
    - 상대적으로 읽으면서 마크를 해놓고 마크 위치로 position이 0으로 이동한다.
    - 모든 위치 속성값을 초기화한다.
    작성일 : 0120
 */

public class BufferExample {
    public static void main(String[] args) {
        System.out.println("[7byte 크기로 버퍼를 만든다. ]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        printState(buffer);

        buffer.put((byte) 10);
        buffer.put((byte) 11);
        System.out.println("[2Byte 저장후]");
        printState(buffer);

        buffer.put((byte) 12);
        buffer.put((byte) 13);
        buffer.put((byte) 14);
        System.out.println("[3Byte 저장후]");
        printState(buffer);

        buffer.flip();
        System.out.println("[flip() 실행후]");
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("[3Byte 읽은 후]");
        printState(buffer);

        buffer.mark();
        System.out.println(" [현 위치를 마크한다.] ");

        buffer.get(new byte[2]);
        System.out.println("[2Byte를 읽은 후]");
        printState(buffer);

        buffer.reset();
        System.out.println("[position을 마크 위치로 옮김]");
        printState(buffer);

        buffer.rewind();
        System.out.println("[rewind() 실행 후]");
        printState(buffer);

        buffer.clear();
        System.out.println("[clear() 실행 후]");
        printState(buffer);
    }

    public static void printState(Buffer buffer) {
        System.out.println("\tposition : " + buffer.position() + ",");
        System.out.println("\tlimit : " + buffer.position() + ", ");
        System.out.println("\tcapacity : " + buffer.capacity());
    }
}
