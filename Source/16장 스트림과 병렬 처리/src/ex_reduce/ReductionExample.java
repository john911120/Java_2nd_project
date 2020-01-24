package ex_reduce;

import java.util.Arrays;
import java.util.List;

/*
		reduce() ����
		- �⺻ ���� �޼ҵ忡�� �پ��� ���� ������� ����� �޼ҵ�
		- �� �������̽����� �Ű�Ÿ������ XXXOperator, ����Ÿ�� OptionalXXX
		- int, long, double�� ������ reduce()�� �����ε��Ǿ��ִ�.
		- ��Ʈ���� ��Ұ� ���� ���� ��� ����Ʈ ���� identity �Ű����� ���ϵȴ�.
		- sum()�� �̿��ϰ�
		- reduce(BinaryOperator<Integer>ac)�̿�		
		- reduce(int identify, IntBinaryOperator op) �̿�
		�ۼ��� : 0108
	*/

public class ReductionExample {

	public static void main(String[] args) {
		// �л� ���� ����Ʈ �ۼ��ϱ�
		List<Student> studentList = Arrays.asList(
				new Student("���ϴ�", 44),
				new Student("�ø���", 55),
				new Student("������", 66)
				);
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a, b) -> a + b)
				.get();
				
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a + b );
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
		System.out.println("sum3 : " + sum3);
	}

}
