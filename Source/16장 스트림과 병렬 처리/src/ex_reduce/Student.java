package ex_reduce;

	/*
	 * 커스텀 집계 예제를 위한 학생 클래스
	 * 작성일 : 0108
	 */

public class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
}