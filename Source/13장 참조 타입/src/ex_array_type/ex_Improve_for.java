package ex_array_type;

	/*
	  	향상된 For문
	  	작성일 : 1220
	 */

public class ex_Improve_for {

	public static void main(String[] args) {
		int[] scores = {10, 30, 50, 70, 90};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
