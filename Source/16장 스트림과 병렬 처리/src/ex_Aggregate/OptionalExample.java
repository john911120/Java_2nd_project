package ex_Aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*
	  	���迹��
	  	- ��Ұ� ���� ������ ��հ��� ���� �� ����.
	  	- NoSuchElementException���ܰ� �߻��Ѵ�.
	  	- ���ܸ� ���ϴ� ����� 3����
	  	- 1. Optional��ü�� ��� isPresent()�� ��հ� ���θ� Ȯ���Ѵ�. 
	  	     true�� ������ ���� getAsDouble�޼ҵ�� ��հ��� ������ �ȴ�.
	  	- 2. orElse()���� ����Ʈ ���� ���س��´�. ��հ��� ���� �� ���� ��쿡�� orElse()�� �Ű����� ����Ʈ ���� �ȴ�.
	  	- 3. ifPresent()���� ��հ��� ���� ��쿡�� ���� �̿��ϴ� ���ٽ��� �����Ѵ�.
	  	�ۼ��� : 0108	  
	 */

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		
		/*
		// ���� �߻�
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
			*/	
		// �ذ� ���1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if ( optional.isPresent() ) {
			System.out.println("���1 ��� : " + optional.getAsDouble());
		} else {
			System.out.println("���1 ��� : 0.0");
		}
		
		// �ذ� ���2
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("���2 ��� : " + avg);
		
		// �ذ� ���3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("��� 3 ��� : " + a));
	}

}
