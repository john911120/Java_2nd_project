package ex_collect;

import java.util.ArrayList;
import java.util.List;

/*
	 * ���л��� ����Ǵ� �����̳�
	 * - �л��� �߿��� ���л��� �����ϴ� �����̳� ����
	 * - ��Ҹ� ������ �÷����� �����.
	 * - ��Ҹ� �����ϴ� �޼ҵ� �����.
	 * - �� MaleStudent�� �����ϴ� �޼ҵ带 �����.(���� ó�� �ÿ��� ȣ��ȴ�.)
	 * - ��Ұ� ���嵵�� �÷����� �����Ѵ�.
	 * �ۼ��� : 0109
	 */

public class MaleStudent {
	private List<Student> list;

	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<Student> getList() {
		return list;
	}
	
	
}
