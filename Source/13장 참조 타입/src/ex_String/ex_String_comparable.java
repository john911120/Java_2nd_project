package ex_String;

	/*
	 	���ڿ��� ���ϴ� ����
	 	�ۼ��� : 1219
	 */

public class ex_String_comparable {

	public static void main(String[] args) {
		String strVar1 = "�ø���";
		String strVar2 = "�ø���";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����.");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ���.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����.");
		}
		String strVar3 = new String("�ø���");
		String strVar4 = new String("�ø���");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����.");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ���.");
		}
			if(strVar3.contentEquals(strVar4)) {
				System.out.println("strVar3�� strVar4�� ���ڿ��� ����.");
		}
	}
}