package TCP_Blocking_Channel;

    /*
        연결 요청을 받는 예제이다.
        - localhost 50 포트로 연결 요청하는 코드
        - connect()이 정상적으로 리턴되면 연결 성공이다.
        - 데이터를 보내고 받는 기능을 추가한다.
        작성일 : 0122
     */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class ClientExample {
    public static void main(String[] args) {
        SocketChannel socketChannel = null;
        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(true);
            System.out.println("[연결요청]");
            socketChannel.connect(new InetSocketAddress("localhost",80));
            System.out.println("[연결성공]");

            ByteBuffer byteBuffer = null;
            Charset charset = Charset.forName("UTF-8");

            // 클라이언트가 먼저 Hello Server를 보낸다.
            byteBuffer =  charset.encode("Hello Server");
            socketChannel.write(byteBuffer);
            System.out.println("[데이터 보내기 성공]");

            // 서버가 이 데이터를 받으면서 클라이언트가 이 데이터를 받는다.
            byteBuffer = ByteBuffer.allocate(100);
            int byteCount = socketChannel.read(byteBuffer);
            byteBuffer.flip();
            String message = charset.decode(byteBuffer).toString();
            System.out.println("[데이터 받기 성공]: " + message);

        } catch(Exception e) {}

        if(socketChannel.isOpen()) {
            try {
                socketChannel.close();
            } catch (IOException e1) {}
        }
    }
}