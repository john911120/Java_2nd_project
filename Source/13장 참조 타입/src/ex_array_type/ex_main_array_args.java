package ex_array_type;

	/*
	 	main()�޼ҵ��� �Ű����� ����
	 	�ۼ��� : 1220
	 */

public class ex_main_array_args {

	public static void main(String[] args) {
		// �Էµ� �������� ������ 2���� �ƴ� ��쿡�� ���α׷��� �����Ѵ�.
		if(args.length != 2) {
			System.out.println("���α׷� �����");
			System.out.println("Java MainStringArrayArgument num1, num2");
			System.exit(0);
		}
		// ù°�� �ι�°�� �����͸� ������
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// ���ڿ��� ������ ��ȯ�Ѵ�.
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
