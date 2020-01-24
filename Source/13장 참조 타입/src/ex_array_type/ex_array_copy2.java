package ex_array_type;

/*
 	배열 복사(System.arrayCopy())으로 데이터 복사
 	작성일  : 1220
 */

public class ex_array_copy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"kotlin","array","copy","에엑따"};
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int j = 0; j<newStrArray.length;j++) {
			System.out.print(newStrArray[j] + ", ");
		}
	}
}