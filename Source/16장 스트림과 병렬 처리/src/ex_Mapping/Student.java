package ex_Mapping;

	/*
	 * 요소 처리를 위한 람다식에 사용되는 학생 클래스
	 * 작성일 : 0106
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