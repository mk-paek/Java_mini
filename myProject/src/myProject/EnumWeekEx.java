package myProject;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1: 
				today = Week.SUNDAY; break;
			case 2: 
				today = Week.MONDAY; break;
			case 3: 
				today = Week.TUESDAY; break;
			case 4: 
				today = Week.WEDNESDAY; break;
			case 5: 
				today = Week.THURSDAY; break;
			case 6: 
				today = Week.FRIDAY; break;
			case 7: 
				today = Week.SATURDAY; break;
		}
		System.out.println("오늘은" + today + " 입니다.");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 여행을 갑니다.");
		} else {
			System.out.println("의정부로~~");
		}
		
	}

}
