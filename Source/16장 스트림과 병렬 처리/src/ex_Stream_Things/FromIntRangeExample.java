package ex_Stream_Things;

import java.util.stream.IntStream;

/*
	  	숫자 범위로 부터 스트림 얻기
	  	- 1에서 100까지의 합을 구하기 
	  	- IntStream의 rangeClosed()를 사용하였고 첫번째 매개값에서 부터 
	  	- 두 번째 값까지 순차적으로 제공하는 IntStram을 리턴한다.
	  	- range()메소드도 동일하게 리턴하지만 두번째 매개값은 포함되지 않는다.
	  	작성일 : 0106
	 */

public class FromIntRangeExample {
	public static int sum;
		
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합 : " + sum);
	}

}
