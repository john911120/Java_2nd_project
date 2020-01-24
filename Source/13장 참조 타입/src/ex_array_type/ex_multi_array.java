package ex_array_type;

/*
  	다차원 배열 예제
  	작성일 : 1220
 */

public class ex_multi_array {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i <mathScores.length; i++) {
			for(int j = 0;  j<mathScores.length; j++) {
				System.out.println("mathScores["+i+"]["+j+"] = " + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i = 0; i <englishScores.length; i++) {
			for(int k = 0;  k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"] = " + englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {60, 70}, {55, 66, 77} };
		
		for(int i = 0; i <javaScores.length; i++) {
			for(int j = 0;  j<javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"] = " + javaScores[i][j]);
			}
		}
	}
}
