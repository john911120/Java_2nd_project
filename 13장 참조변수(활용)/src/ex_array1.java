public class ex_array1 {

	/*
	 	for문을 활용해서 주어진 배열의 항목에서 최대값을 구하기
	 	작성일 : 1224
	 */
	
	
	public static void main(String[] args) {
		int max = 0;
		
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i = 0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
	}

}
