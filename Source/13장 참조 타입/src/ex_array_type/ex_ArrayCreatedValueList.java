package ex_array_type;

	/*
	 	�� ������� �迭�� ����� ����
	  	�ۼ��� : 1219
	 */
public class ex_ArrayCreatedValueList {

	public static void main(String[] args) {
		int[] scores = {50, 60, 70, 80};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		System.out.println("scores[3] : " + scores[3]);
		
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			sum += scores[i];
		}
		
		System.out.println("���� : " + sum );
		double avg = (double) sum / 4;
		System.out.println("��� : " + avg);
	}

}
