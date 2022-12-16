package sec2;

import java.util.Calendar;

public class Ref2 {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int w = cal.get(Calendar.DAY_OF_WEEK); //오늘 날짜의 요일 번호 가져오기
		System.out.println(w); //1~7(일~토)
		System.out.println();
		switch(w) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘의 요일 : "+today); //여기까지 중요함
		System.out.println("name : "+today.name());
		System.out.println("original : "+today.ordinal()); //0~6
		Week day1 = Week.SATURDAY;
		System.out.println("요일 비교 : "+today.compareTo(day1)); //1: true, 1이 아닌 값: false
		System.out.println("********************");
		Week [] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
			
			}
			
		
	}

}
