package ex_sorted;

	/*
	 * 정렬예제를 위한 학생 클래스
	 * - 클래스가 Comparable구현 하지 않으면 sort메소드 호출이 안되며
	 * - ClassCastException이라는 예외가 발생한다. 그래서 Comparable을 구현한 요소
	 * - 에서만 sorted메소드를 호출해야한다.
	 * - 점수를 기준으로 Student요소를 오름차순으로 정렬하기 위해 Comparable을 구성했다.
	 * 작성일 : 0107
	 */

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
}