package ex_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
	  Iterator�� Stream���� ó�� �ڵ�
	  �ۼ��� : 0106
	 */

public class IteratorVsStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("�ø���","���ϴ�","������");
		
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
