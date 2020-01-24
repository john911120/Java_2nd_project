package ex_Matching;

import java.util.Arrays;

/*
	  	매칭
	  	- int배열으로부터 스트림을 만들고
	  	- 모든 요소가 2의 배수인지?
	  	- 하나라도 3의 배수가 존재하는가? 모든 요소가 3의 배수가 아닌가?를 조사한다.
	    작성일 : 0107
	 */

public class MatchingExample {

	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 == 0);
		System.out.println("모두 2의 배수인가?" + result);		
		
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("하나라도 3의 배수가 있는가?" + result);
		
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 있는가?" + result);
	}

}
