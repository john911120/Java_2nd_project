package ex_array_type;

	/*
	  	객체를 참조하는 배열 생성
	  	작성일 : 1220
	 */

public class ex_array_reference {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Kotlin";
		strArray[1] = "Kotlin";
		strArray[2] = new String("Kotlin");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].contentEquals(strArray[2]));
	}
}