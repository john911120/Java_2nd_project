package ex_array_type;

	/*
	  	배열의 길이(length Method) 예제
	  	작성일 : 1220
	 */

public class ex_array_length {

	public static void main(String[] args) {
		int[] scores = {70, 80, 90, 100};
				
		int sum = 0;
		for(int i = 0; i <scores.length; i++) {
			sum += scores[i];
		}
			System.out.println("총합 : " + sum);
		
		
		double avg = (double) sum / scores.length;
			System.out.println("평균 : " + avg);
	}

}
