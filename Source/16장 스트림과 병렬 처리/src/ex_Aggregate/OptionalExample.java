package ex_Aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*
	  	집계예제
	  	- 요소가 없기 때문에 평균값도 있을 수 없다.
	  	- NoSuchElementException예외가 발생한다.
	  	- 예외를 피하는 방법은 3가지
	  	- 1. Optional객체를 얻어 isPresent()로 평균값 여부를 확인한다. 
	  	     true를 리턴할 때만 getAsDouble메소드로 평균값을 얻으면 된다.
	  	- 2. orElse()으로 디폴트 값을 정해놓는다. 평균값을 구할 수 없는 경우에는 orElse()의 매개값이 디폴트 값이 된다.
	  	- 3. ifPresent()으로 평균값이 있을 경우에만 값을 이용하는 람다식을 실행한다.
	  	작성일 : 0108	  
	 */

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		
		/*
		// 예외 발생
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
			*/	
		// 해결 방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if ( optional.isPresent() ) {
			System.out.println("방법1 평균 : " + optional.getAsDouble());
		} else {
			System.out.println("방법1 평균 : 0.0");
		}
		
		// 해결 방법2
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2 평균 : " + avg);
		
		// 해결 방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법 3 평균 : " + a));
	}

}
