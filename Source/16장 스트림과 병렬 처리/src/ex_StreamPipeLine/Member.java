package ex_StreamPipeLine;

	/*
		스트림 파이프 라인 예제를 위한 회원 클래스
		작성일 : 0106
	*/

public class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() { return sex; }

	public int getAge() { return age; }

}
