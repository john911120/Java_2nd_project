package ex_array_type;

	/*
	  	�迭�� ����(length Method) ����
	  	�ۼ��� : 1220
	 */

public class ex_array_length {

	public static void main(String[] args) {
		int[] scores = {70, 80, 90, 100};
				
		int sum = 0;
		for(int i = 0; i <scores.length; i++) {
			sum += scores[i];
		}
			System.out.println("���� : " + sum);
		
		
		double avg = (double) sum / scores.length;
			System.out.println("��� : " + avg);
	}

}
