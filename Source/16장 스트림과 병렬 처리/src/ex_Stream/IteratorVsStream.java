package ex_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
	  Iterator와 Stream순차 처리 코드
	  작성일 : 0106
	 */

public class IteratorVsStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("시명이","두하니","상하이");
		
		// Iterator 
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		// Stream
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name) );
		
	}

}
