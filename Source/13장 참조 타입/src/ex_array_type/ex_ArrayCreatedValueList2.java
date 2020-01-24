package ex_array_type;

	/*
	 	값의 리스트로 배열을 만드는 예제
	  	작성일 : 1219
	 */
public class ex_ArrayCreatedValueList2 {

	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {50, 60, 70, 80};
		
		int sum1 = 0;
		for(int i = 0; i<4; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		// 리턴된 총합을 sum2에 저장한다.
		int sum2 = add( new int[] {50, 60, 70, 80} );
		System.out.println("총합 : " + sum2);
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
