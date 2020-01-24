package ex_Parallel_Operation;

import java.util.Arrays;
import java.util.List;

import ex_collect.MaleStudent;
import ex_collect.Student;

/*
	 * ���л��� MaleStudent�� ���� ��Ű��(���� ó�� ���)
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
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() == Student.Sex.Male)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
