package ex_Aggregate;

import java.util.Arrays;

/*
		집계 관련 스트림
		- 값을 저장하는 값 기반 클래스들으로
		- 이 객체에서 값을 얻기 위해서는 get(), getAsDouble(), getAsInt(), getAsLong()
		작성일 : 0108
	*/

public class AggregateExample {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2 == 0)
				.count();
		System.out.println("2의 배수 개수 : " + count);
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2 == 0)
				.sum();
		System.out.println("2의 배수의 합 : " + sum);
		
		double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2 == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균 : " + avg);
		
		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2 == 0)
				.max()
				.getAsInt();
		System.out.println("최대값 : " + max);
		
		int min = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2 == 0)
				.min()
				.getAsInt();
		System.out.println("최소값 : " + max);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%3 == 0)
				.findFirst()
				.getAsInt();
		System.out.println("첫번째 3의 배수 : " + first);
	}

}
