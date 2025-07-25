package stage04.control.et06;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendarEtude {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년 입력 > "); int year  = sc.nextInt();
		System.out.print("월 입력 > "); int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int end = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("일 월 화 수 목 금 토");
		for(int w=1; w < week; w++) {
			System.out.print("   ");
		}
		for(int d=1,w=week; d <= end; d++,w++) {
			System.out.print(d < 10 ? " " + d + " " : d + " ");
			if (w % 7 == 0) System.out.println();
		}
		System.out.println("au revoir!");
	}
}
