package ex_Mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
		다른 요소로 대체하기
		- int배열으로부터 IntStream을 얻고 난 다음 int요소를 double요소로 타입 변환
		- DoubleStream을 만들어서 int 요소를 Integer객체로 박싱해서 Stream<Integer>를 만든다.
		- DoubleStream, Stream<Integer>를 만든다.
		작성일 : 0107
	*/

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		int[] intArray = {1, 3, 5, 7, 9};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}

}
