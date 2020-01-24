package Buffer;

/*
    컴퓨터의 기본 바이트 해석순서 예제
    - LITTLE_ENDIAN으로 동작하는 운영체제에서 만든 데이터 파일을 Big endian으로 동작하는
    운영체제에서 읽는다면 ByteOrder클래스로 데이터 순서를 맞춰야한다.
    - ByteOrder 클래스의 nativeOrder()는ㅇ 현재 동작하고 있는 운영체제가 Big endian인가?
    아니면 Little_endian인가를 알려준다.
    작성일 : 0120
 */

import java.nio.ByteOrder;

public class ComputerByteOrderExample {
    public static void main(String[] args) {
        System.out.println("운영 체제의 종류 : " + System.getProperty("os.name"));
        System.out.println("네이티브의 바이트 해석 순서 : " + ByteOrder.nativeOrder());
    }
}
