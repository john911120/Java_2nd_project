package ex_StreamPipeLine;

import java.util.*;

/*
	  	스트림 파이프라인 연습 예제
	  	- 예제 연습을 위해 회원 컬렉션으로 필터링하는 중간 스트림을 연결하고
	  	- 다시 매핑하는 스트림을 연결한 다음 집계를 하면 파이프 라인이 생성된다.
	  	- 여기서는 남성회원의 평균 나이를 구하는 프로그램을 작성한다.
	    작성일 : 0106
	 */
	
public class StreamPipelinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("시명이", Member.MALE, 37),
				new Member("상하이", Member.MALE, 29),
				new Member("애기보살", Member.FEMALE, 24),
				new Member("Eblin", Member.FEMALE, 28)
				);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("남자 평균 나이 : " + ageAvg);
	}

}
