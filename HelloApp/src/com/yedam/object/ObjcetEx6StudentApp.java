package com.yedam.object;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjcetEx6StudentApp {
	// 학생정보관리 App
	// 1.등록 2.목록 3.조회(이름) 4.수정(점수) 학생번호 5.삭제(학생번호 기준) 6.종료.
	// 학생정보: 학생번호(23-001)/이름/성별(남/여) 구분 /점수
	static Scanner scr = new Scanner(System.in);
	static Student[] st = new Student[6];
	Student stinfo = new Student();
	static String check;

	public static void register() {
		Student stinfo = new Student();
		System.out.println("학생번호를 입력해주세요.");
		stinfo.setStNum(scr.nextLine());

		System.out.println("학생 이름을 입력해주세요.");
		stinfo.setName(scr.nextLine());

		System.out.println("성별을 입력해주세요.");
		stinfo.setGender(scr.nextLine());

		System.out.println("학생점수를 입력해주세요.");
		stinfo.setScore(Integer.parseInt(scr.nextLine()));

		for (int i = 0; i < st.length; i++) {
			if (st[i] == null) {
				st[i] = stinfo;
				break;
			}
		}
	}

	public static void list() {
		boolean isExist = false;
		int men = 0;
		int won = 0;
		int max = 0;
		String name = null;
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				st[i].showInfo();
				isExist = true;
			}
			if (st[i] != null && st[i].getGender().equals("남자")) {
				men++;
			} else if (st[i] != null && st[i].getGender().equals("여자")) {
				won++;
			}
			if (st[i] != null && max < st[i].getScore()) {
				max = st[i].getScore();
				name = st[i].getName();
			} else {
				System.out.println("null");
			}
		}
		if (isExist) {
			System.out.println("====================================");
			System.out.printf("남자-%d명  여자-%d명 최고점수: %s - %d점 \n", men, won, name, max);
		} else {
			System.out.println("등록된 정보가 없습니다.");
		}
	}

	public static void search() {
		System.out.println("조회할 학생 이름을 입력해주세요.");
		check = scr.nextLine();
		boolean isExist = false;
		
		
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].getName().equals(check)) {
				System.out.printf("학생번호 %s  학생이름 %s  성별 %s  점수 %d \n", st[i].getStNum(), st[i].getName(),
						st[i].getGender(), st[i].getScore());
				isExist = true;
			}
		}
		if(!isExist) {
			System.out.printf("%s 학생정보가 없습니다.", check);
		}
	}

	public static void modify() {
		System.out.println("조회할 학생 번호를 입력해주세요.");
		check = scr.nextLine();
		if(!checkInfo(check)) {
			System.out.println("찾는 정보가 없습니다.");
			return;
		}
		
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].getStNum().equals(check)) {
				int point = st[i].getScore();
				System.out.print("수정할 점수를 입력해 주세요.");
				st[i].setScore(Integer.parseInt(scr.nextLine()));
				System.out.printf("기존 점수: %d -> 수정 점수: %d \n", point, st[i].getScore());
			}
		}
	}

	public static void remove() {
		System.out.println("조회할 학생 번호를 입력해주세요.");
		check = scr.nextLine();
		if(!checkInfo(check)) {
			System.out.println("찾는 정보가 없습니다.");
			return;
		}
		
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null && st[i].getStNum().equals(check)) {
				st[i] = null;
				System.out.println("학생 정보를 삭제를 했습니다.");
			}
		}
	}
	public static boolean checkInfo(String sno) {
		boolean isExist = false;
		for(Student student : st) {
			if(student != null && student.getStNum().equals(sno)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("1.등록  2.목록  3.조회(이름)  4.수정(점수)  5.삭제  6.종료");
			int selectNo = Integer.parseInt(scr.nextLine());
			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				list();
			} else if (selectNo == 3) {
				search();
			} else if (selectNo == 4) {
				modify();
			} else if (selectNo == 5) {
				remove();
			} else if (selectNo == 6) {
				System.out.println("시스템 종료");
				run = false;
			}
		}
	}
	// 1. 등록 = register() 2. list() 3. search() 4. modify() 5. remove() 6. 종료
	// 목록 할 경우 남학생 - 2명, 여학생 3명 정보 필요. / 최고점수: 이름 - 100점

}
