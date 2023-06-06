package com.yedam.insa;

import java.util.Calendar;

//set(), cal()
public class CalendarEx {
	static private int year; // 년도 정보를 지정한 필드
	static private int month; // 월저보를 지정한 필드.
	
	//static 메소드
	static void set(int year, int month) {	
		CalendarEx.year = year;
		CalendarEx.month = month-1; //  사용자의 입력값과 월정보를 맞춤.
		
	}
	static void cal() {
		Calendar cal = Calendar.getInstance();
		cal.set(CalendarEx.year, CalendarEx.month, 1);
		
		int firstDate = cal.get(Calendar.DAY_OF_WEEK) -1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		String title = "===" + year + "년 " + (month+1) + "월 달력" + "====";
		System.out.println(title);
		String days = " Sun  Mon  Tue  Wed  Fri  Sat";
		System.out.println(days);
		System.out.println("=============================");
		
		//1일 위치를 정해주기 위해 빈공란을 출력.
		for(int i =0; i< firstDate; i++) {
			System.out.printf("%3s ", "");
		}
		for (int day =1; day<=lastDate; day++) {
			// 줄바꿈처리.
			System.out.printf("%3d ", day);
			if((firstDate + day) % 7 == 0) {
				System.out.println();
			}
		}
	}
	
}
