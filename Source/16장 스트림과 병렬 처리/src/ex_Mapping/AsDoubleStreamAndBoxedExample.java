package ex_Mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
		�ٸ� ��ҷ� ��ü�ϱ�
		- int�迭���κ��� IntStream�� ��� �� ���� int��Ҹ� double��ҷ� Ÿ�� ��ȯ
		- DoubleStream�� ���� int ��Ҹ� Integer��ü�� �ڽ��ؼ� Stream<Integer>�� �����.
		- DoubleStream, Stream<Integer>�� �����.
		�ۼ��� : 0107
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
