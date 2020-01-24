package ex_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
	  	���͸��ؼ� ���ο� �÷����� �����.
	  	- �л����� ������ ��� List�� �����Ѵ�.
	  	�ۼ��� : 0109
	 */

public class ToListExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("�ø���", 20, Student.Sex.Male),
				new Student("�ֱ⺸��", 24, Student.Sex.Female),
				new Student("���ϴ�", 29, Student.Sex.Male),
				new Student("����", 25, Student.Sex.Female)
				);
		// ���л��� ��� List�� �����.
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.Male)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// ���л��� ��� HashSet�� �����.
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.Female)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
