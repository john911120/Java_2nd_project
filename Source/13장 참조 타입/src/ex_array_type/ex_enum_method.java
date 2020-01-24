package ex_array_type;

/*
 	���� ��ü�� �޼ҵ� ����
 	�ۼ��� : 1223
 */

public class ex_enum_method {

	public static void main(String[] args) {
		// name()�޼ҵ�
		Week today = Week.Sunday;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()�޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//comepareTo()�޼ҵ�
		Week day1 = Week.Monday;
		Week day2 = Week.Wednesday;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//ValueOf()�޼ҵ�
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.Saturday || weekDay == Week.Sunday) {
				System.out.println("�ָ��Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		
		//Values()�޼ҵ�
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
