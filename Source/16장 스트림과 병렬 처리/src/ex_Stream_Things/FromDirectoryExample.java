package ex_Stream_Things;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
	  	디렉토리로부터 스트림 얻어오기
	  	- Files의 정적 메소드인 list()를 이용해서 디렉토리의 내용을 스트림을 통해 읽고 출력한다.
	  	- 서브 디렉토리 또는 파일에서 해당하는 Path 객체를 p로 지정
	  	- 서브 디렉토리 이름 또는 파일 이름을 리턴한다.
	  	- 파일 디렉토리는 사용자의 컴퓨터에 따라 다르므로 사용할 때 반드시 디렉토리 설정을 해야한다.
	  	작성일 : 0106	  	
	 */


public class FromDirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Java-Workspace/sample");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
	}

}
