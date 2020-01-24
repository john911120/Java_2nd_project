package TCP_Blocking_Channel;

    /*
        - accept()를 호출해서 다중 클라이언트 연결 수락받는 코드이다.
        - 데이터를 받고 보내는 기능을 추가한다.
        작성일 : 0122
     */


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class ServerSample {
    public static void main(String[] args) {
        ServerSocketChannel serverSocketChannel = null;
        try {
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(true);
            serverSocketChannel.bind(new InetSocketAddress(80));
            while (true) {
                System.out.println("[연결 대기중.]");
                SocketChannel socketChannel = serverSocketChannel.accept();
                InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
                System.out.println("[연결 수락]" + isa.getHostName());

                ByteBuffer byteBuffer = null;
                Charset charset = Charset.forName("UTF-8");

                byteBuffer = ByteBuffer.allocate(100);
                int byteCount = socketChannel.read(byteBuffer);
                byteBuffer.flip();
                String message = charset.decode(byteBuffer).toString();
                System.out.println("[데이터 받기 성공] : " + message);

                // "Hello Client"를 클라이언트로 보내면
                byteBuffer = charset.encode("Hello Client");
                socketChannel.write(byteBuffer);
                System.out.println("[데이터 보내기 성공]");
            }
        } catch (Exception e) { }

        // ServerSocketChannel이 열려있다면 닫는다.
        if(serverSocketChannel.isOpen()) {
            try {
                serverSocketChannel.close();
            } catch (IOException e1) {}
        }
    }
}
