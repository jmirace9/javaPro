package days10;

import java.util.Date;
import java.util.Scanner;

import com.util.Graphic2D;

/**
 * @author kenik
 * @date 2026. 5. 22. 오후 3:26:03
 * @subject 
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.print("> 년도, 월 입력: "); // 2026 5
		year = scanner.nextInt();
		month = scanner.nextInt();  // String regex = "^([1-9]|1[0-2])$"

		createCalendar(year, month);

	} // main

	private static void createCalendar(int year, int month) {
		// [1] 년도,월의 1일 무슨 요일 ?  금
		int dayOfWeek = getDayOfWeek(year, month, 1);
		// [2] 년도,월이 몇일 까지 있는지? 31
		int lastDayOfMonth = getLastDayOfMonth(year, month);
		
		// [3] 달력 출력
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
		Graphic2D.drawLine(60, '-');
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}
		System.out.println();
		Graphic2D.drawLine(60, '-');
		// 1위치를 잡기 위해  for문
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
//		System.out.printf("\t%d", 1);  // 1~마지막 날짜.
		for (int i = 1; i <= lastDayOfMonth; i++) {
			System.out.printf("\t%s", isToday(year, month, i) ? "("+i+")" : i+"");
			if ((i+dayOfWeek)%7==0) {
				System.out.println(); // 개행
			} // if
		} // for i
		
		
		System.out.println(); // 개행
		Graphic2D.drawLine(60, '-');
		
	}
	
	private static boolean isToday(int year, int month, int date) {
		Date d = new Date(); // 현재 시스템의 날짜+시간 객체
		
		int currentYear = d.getYear()+1900;
		int currentMonth = d.getMonth() + 1;
		int currentDate = d.getDate();
		
		if ( currentYear == year && currentMonth == month && currentDate == date ) {
			return true;
		}
		
		return false;
	}

	// [2] 풀이
	private static int getLastDayOfMonth(int year, int month) {
		int lastDayOfMonth = 0;
		Date d = new Date( year-1900, month-1, 1); // 2026.5.1
		// 1) 한달 더하기 2026.6.1
		d.setMonth( d.getMonth()+1 );
//		System.out.println( d.toLocaleString() );
		
		// 2) 하루를 빼기 2026.5.31
		d.setDate( d.getDate()-1 );
//		System.out.println( d.toLocaleString() );
		
		// 3) 날짜(일) 얻어오기				
		return lastDayOfMonth = d.getDate();
	}

	/* [1] 풀이
	private static int getLastDayOfMonth(int year, int month) {
//		31: 1, 3, 5, 7, 8, 10, 12		
//		30: 4, 6, 9, 11, 
//		28, 29: 2    	
		
		int lastDayOfMonth = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 4, 6, 9, 11 -> 30;
			// default  -> 28;
			default -> {
				boolean isLeapYear =
		                (year % 4 == 0 && year % 100 != 0)
		                || (year % 400 == 0);
				
                // yield 키워드는 JDK14 값을 반환할 때 사용하는 예약어
				// {} 블럭 안에 코딩을 한 후 값을 반환할 때 ..  "
		        yield isLeapYear ? 29 : 28;
			}
		} ; // switch
		
//		System.out.println( lastDayOfMonth );
		return lastDayOfMonth;
	}
	*/

	// 1. 요일 반환 메서드 선언
	public static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date( year-1900, month-1, date);
		// d.getYear()
 		int dayOfWeek = d.getDay(); 
// 		System.out.println( "일월화수목금토".charAt(dayOfWeek) );
		return dayOfWeek;  // 0(일) 1(월) ... 6(토)
	}
	
	
	// 2. 마지막 날짜 반환 메서드 선언

} // class
