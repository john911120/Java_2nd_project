package ex_sorted;

	/*
	 * ���Ŀ����� ���� �л� Ŭ����
	 * - Ŭ������ Comparable���� ���� ������ sort�޼ҵ� ȣ���� �ȵǸ�
	 * - ClassCastException�̶�� ���ܰ� �߻��Ѵ�. �׷��� Comparable�� ������ ���
	 * - ������ sorted�޼ҵ带 ȣ���ؾ��Ѵ�.
	 * - ������ �������� Student��Ҹ� ������������ �����ϱ� ���� Comparable�� �����ߴ�.
	 * �ۼ��� : 0107
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