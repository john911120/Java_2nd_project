package ex_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	  	���ٽ��� Ȱ���Ͽ��� ���ó���� �ϴ� ���
	  	- ��Ʈ���� ���ͼ�
	  	- List�÷��ǿ��� Student�� ������ ���ٽ��� �Ű������� �����Ѵ�.
	  	�ۼ��� : 0106
	 */

public class LambdaExpression {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("�ø���", 70),
				new Student("���ϴ�", 80)
				);
		
		Stream<Student>	stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
