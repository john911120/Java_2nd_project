package ex_anonymous_object_using_localVar;

	/*
	  	익명 객체의 로컬 변수를 사용하기
	  	작성일 : 1226
	 */

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		/*
		final 키워드의 뜻만 안다면 이 코드는 사용을 할 수 없다.
		final은 값이 한번 추가되면  변수를 추가하거나 수정을 할 수 없다. 
		arg1 = 20;
		arg2 = 20;
		
		var1 = 30;
		var2 = 30;
		*/
		
		Calculable calc = new Calculable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
