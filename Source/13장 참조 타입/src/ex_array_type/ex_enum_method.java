package ex_array_type;

/*
 	열거 객체의 메소드 예제
 	작성일 : 1223
 */

public class ex_enum_method {

	public static void main(String[] args) {
		// name()메소드
		Week today = Week.Sunday;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//comepareTo()메소드
		Week day1 = Week.Monday;
		Week day2 = Week.Wednesday;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//ValueOf()메소드
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.Saturday || weekDay == Week.Sunday) {
				System.out.println("주말입니다.");
			} else {
				System.out.println("평일입니다.");
			}
		}
		
		//Values()메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
