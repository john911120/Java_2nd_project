package ex_Filltering;

import java.util.*;

/*
	  	���͸� ����
	  	- �̸� ����Ʈ���� �ߺ��� �̸��� �����ϰ� ����ϸ�
	  	- Ư�� �̸��� ���� �� �̶�� �̸��� ���͸��ϴ� ����� �־���.
	  	�ۼ��� : 0106
	 */

public class FillteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("�ø���", "�ɿ�", "���ϴ�", "�����", "�ɿ��� ��Ӵ�");
		
		// ����Ʈ�� �ߺ��� ����
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// ����Ʈ�� ���͸�
		names.stream()
			.filter(n -> n.startsWith("��"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// �ߺ� ���� �� ���͸�
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("��"))
			.forEach(n -> System.out.println(n));
	}

}
