package ex_array_type;

	/*
	 	���� ����Ʈ�� �迭�� ����� ����
	  	�ۼ��� : 1219
	 */
public class ex_ArrayCreatedValueList2 {

	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {50, 60, 70, 80};
		
		int sum1 = 0;
		for(int i = 0; i<4; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		// ���ϵ� ������ sum2�� �����Ѵ�.
		int sum2 = add( new int[] {50, 60, 70, 80} );
		System.out.println("���� : " + sum2);
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
