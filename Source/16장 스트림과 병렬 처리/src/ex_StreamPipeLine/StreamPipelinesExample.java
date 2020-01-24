package ex_StreamPipeLine;

import java.util.*;

/*
	  	��Ʈ�� ���������� ���� ����
	  	- ���� ������ ���� ȸ�� �÷������� ���͸��ϴ� �߰� ��Ʈ���� �����ϰ�
	  	- �ٽ� �����ϴ� ��Ʈ���� ������ ���� ���踦 �ϸ� ������ ������ �����ȴ�.
	  	- ���⼭�� ����ȸ���� ��� ���̸� ���ϴ� ���α׷��� �ۼ��Ѵ�.
	    �ۼ��� : 0106
	 */
	
public class StreamPipelinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("�ø���", Member.MALE, 37),
				new Member("������", Member.MALE, 29),
				new Member("�ֱ⺸��", Member.FEMALE, 24),
				new Member("Eblin", Member.FEMALE, 28)
				);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("���� ��� ���� : " + ageAvg);
	}

}
