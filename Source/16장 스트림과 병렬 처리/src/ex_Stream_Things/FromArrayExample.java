package ex_Stream_Things;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
		배열으로부터 스트림 얻어오기
		- String[]과 int[] 배열으로 부터 스트림을 얻어내고 콘솔 출력하기
		작성일 : 0106
	*/

public class FromArrayExample {

	public static void main(String[] args) {
		// String[]
		String[] strArray = {"에엑따", "뚝배기양반", "X까네" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		// int[]
		int[] intArray = {10, 20, 30, 40, 50};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}

}
