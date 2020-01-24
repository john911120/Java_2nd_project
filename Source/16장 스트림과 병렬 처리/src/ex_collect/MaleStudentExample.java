package ex_collect;

import java.util.Arrays;
import java.util.List;

/*
	 * 남학생을 MaleStudent에 누적 시키기
	 * 작성일 : 0109
	 */

public class MaleStudentExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("시명이", 20, Student.Sex.Male),
				new Student("애기보살", 24, Student.Sex.Female),
				new Student("두하니", 29, Student.Sex.Male),
				new Student("설향", 25, Student.Sex.Female)
				);
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.Male)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
