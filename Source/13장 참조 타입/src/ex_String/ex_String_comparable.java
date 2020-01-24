package ex_String;

	/*
	 	문자열을 비교하는 예제
	 	작성일 : 1219
	 */

public class ex_String_comparable {

	public static void main(String[] args) {
		String strVar1 = "시명이";
		String strVar2 = "시명이";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1와 strVar2는 참조가 같다.");
		} else {
			System.out.println("strVar1와 strVar2는 참조가 다르다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1와 strVar2는 문자열이 같다.");
		}
		String strVar3 = new String("시명이");
		String strVar4 = new String("시명이");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같다.");
		} else {
			System.out.println("strVar3와 strVar4는 참조가 다르다.");
		}
			if(strVar3.contentEquals(strVar4)) {
				System.out.println("strVar3와 strVar4는 문자열이 같다.");
		}
	}
}