package ex_Matching;

import java.util.Arrays;

/*
	  	��Ī
	  	- int�迭���κ��� ��Ʈ���� �����
	  	- ��� ��Ұ� 2�� �������?
	  	- �ϳ��� 3�� ����� �����ϴ°�? ��� ��Ұ� 3�� ����� �ƴѰ�?�� �����Ѵ�.
	    �ۼ��� : 0107
	 */

public class MatchingExample {

	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 == 0);
		System.out.println("��� 2�� ����ΰ�?" + result);		
		
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("�ϳ��� 3�� ����� �ִ°�?" + result);
		
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("3�� ����� �ִ°�?" + result);
	}

}
