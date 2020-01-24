package ex_nested_interface;

/*
  	리스너의 기능을 구현시키는 클래스
  	작성일 : 1225
 */

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
	}
	
}
