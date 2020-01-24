package ex_collect;

import java.util.Arrays;
import java.util.List;

/*
	 * ���л��� MaleStudent�� ���� ��Ű��
	 * �ۼ��� : 0109
	 */

public class MaleStudentExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("�ø���", 20, Student.Sex.Male),
				new Student("�ֱ⺸��", 24, Student.Sex.Female),
				new Student("���ϴ�", 29, Student.Sex.Male),
				new Student("����", 25, Student.Sex.Female)
				);
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.Male)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
