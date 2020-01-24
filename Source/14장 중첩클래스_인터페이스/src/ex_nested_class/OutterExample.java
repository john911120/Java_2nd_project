package ex_nested_class;

/*
 * 중첩 클래스에서 바깥 클래스 참조 얻기(실행 클래스)
 * 작성일 : 1225
 */

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
