package ex_array_type;

/*
 	�迭 ����(System.arrayCopy())���� ������ ����
 	�ۼ���  : 1220
 */

public class ex_array_copy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"kotlin","array","copy","������"};
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int j = 0; j<newStrArray.length;j++) {
			System.out.print(newStrArray[j] + ", ");
		}
	}
}