package ex_collect;

import java.util.ArrayList;
import java.util.List;

/*
	 * 남학생이 저장되는 컨테이너
	 * - 학생들 중에서 남학생만 수집하는 컨테이너 정의
	 * - 요소를 지정할 컬렉션을 만든다.
	 * - 요소를 수집하는 메소드 만든다.
	 * - 두 MaleStudent를 결합하는 메소드를 만든다.(병렬 처리 시에만 호출된다.)
	 * - 요소가 저장도니 컬렉션을 리턴한다.
	 * 작성일 : 0109
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
