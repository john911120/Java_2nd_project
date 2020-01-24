package ex_Stream_Things;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
	  	���丮�κ��� ��Ʈ�� ������
	  	- Files�� ���� �޼ҵ��� list()�� �̿��ؼ� ���丮�� ������ ��Ʈ���� ���� �а� ����Ѵ�.
	  	- ���� ���丮 �Ǵ� ���Ͽ��� �ش��ϴ� Path ��ü�� p�� ����
	  	- ���� ���丮 �̸� �Ǵ� ���� �̸��� �����Ѵ�.
	  	- ���� ���丮�� ������� ��ǻ�Ϳ� ���� �ٸ��Ƿ� ����� �� �ݵ�� ���丮 ������ �ؾ��Ѵ�.
	  	�ۼ��� : 0106	  	
	 */


public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Java-Workspace/sample");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
	}

}
