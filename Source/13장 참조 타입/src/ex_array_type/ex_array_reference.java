package ex_array_type;

	/*
	  	��ü�� �����ϴ� �迭 ����
	  	�ۼ��� : 1220
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