package ex_collect;

	/*
	 * 필터링해서 새로운 컬렉션을 만드는 예제를 사용하는 학생 클래스
	 * - 학생의 성별과 거주도시 성적과 같은 정보를 추가할 수있는 기능을 넣는다
	 * 작성일 : 0109
	 */

public class Student {
	public enum Sex { Male, Female }
	public enum City{ Seoul, Suwon }
	
	private String name;
	private int score;
	private Sex sex;
	private City city;	

	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
		
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	public Sex getSex() { return sex; }
	public City getCity() { return city; }
	
}