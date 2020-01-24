package ex_Stream_Things;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.stream.Stream;

/*
	  	�������κ��� ��Ʈ���� ���
	  	- Files�� ���� �޼ҵ��� lines()�� BufferedReader�� lines()�� �̿�
	  	- ���� ������ ������ ��Ʈ���Ѵ�.
	  	- ������ ��� ������ ������ �ִ� Path��ü�� �����
	  	- �ü���� �⺻ ���ڼ� ����
	  	- FileReader, BufferedReader���� ����� ������ �о���� ����� �Ѵ�.
	  	�ۼ��� : 0106
	 */

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/ex_Stream_Things/linedata.txt");
		Stream<String> stream;
		
		// File.lines() �̿�
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out :: println );
		System.out.println();
		
		// BufferedReader�� lines()�̿�
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println);
	}

}
