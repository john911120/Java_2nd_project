package ex_array_type;

	/*
	  	���� For��
	  	�ۼ��� : 1220
	 */

public class ex_Improve_for {

	public static void main(String[] args) {
		int[] scores = {10, 30, 50, 70, 90};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("���� ���� = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);
	}

}
