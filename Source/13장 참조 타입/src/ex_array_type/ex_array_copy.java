package ex_array_type;

/*
 	배열 복사(for 문으로 배열을 복사한다.)
 	작성일  : 1220
 */

public class ex_array_copy {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i <oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int j = 0; j<newIntArray.length;j++) {
			System.out.print(newIntArray[j] + ", ");
		}
	}
}