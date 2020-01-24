package ex_array_type;

	/*
	 	main()메소드의 매개변수 예제
	 	작성일 : 1220
	 */

public class ex_main_array_args {

	public static void main(String[] args) {
		// 입력된 데이터의 개수가 2개가 아닐 경우에는 프로그램을 종료한다.
		if(args.length != 2) {
			System.out.println("프로그램 사용방법");
			System.out.println("Java MainStringArrayArgument num1, num2");
			System.exit(0);
		}
		// 첫째와 두번째의 데이터를 얻어오기
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// 문자열을 정수로 변환한다.
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
