package ex_Looping_for_Each;

import java.util.Arrays;

/*
	  	루핑 예제
	  	- forEach메소드는 요소를 소비하는 최종 처리 메소드로
	  	- sum메소드와 같은 다른 최종 메소드를 호출하면 안된다.
	  	작성일 : 0107	 	
	 */

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.peek(n -> System.out.println(n)); // 동작하지 않는다.
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n)) // 동작
				.sum(); // 최종 메소드
		System.out.println("총합 : " + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a%2 == 0)
			.forEach(n -> System.out.println(n));
		
	}

}
