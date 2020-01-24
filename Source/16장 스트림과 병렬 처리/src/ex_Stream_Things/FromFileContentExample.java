package ex_Stream_Things;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.stream.Stream;

/*
	  	파일으로부터 스트림을 얻기
	  	- Files의 정적 메소드인 lines()와 BufferedReader의 lines()를 이용
	  	- 문자 파일의 내용을 스트림한다.
	  	- 파일의 경로 정보를 가지고 있는 Path객체를 만들고
	  	- 운영체제의 기본 문자셋 설정
	  	- FileReader, BufferedReader으로 저장된 파일을 읽어오는 기능을 한다.
	  	작성일 : 0106
	 */

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/ex_Stream_Things/linedata.txt");
		Stream<String> stream;
		
		// File.lines() 이용
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out :: println );
		System.out.println();
		
		// BufferedReader의 lines()이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println);
	}

}
