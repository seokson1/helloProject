package com.yedam.variable;

//클래스 명은 대문자로 시작. 관례
//com.yedam.variable. VariableEx1 클래스 이름 풀 네임
public class VariableEx1 {
	public static void main(String[] args) {
		//변수:변하는 값을 저장. 컴퓨터의 메모리에 저장 공간에 값을 저장.
		int num1; // 음의 정수, 0, 양의 정수
		num1 = 100;
		num1 = -100;
		double num2 = -1.2;
		num2 = 12.3;
		num2 = 123.0; // 정수 -> 실수 내부적으로 형변환 일어남. 하지만 실수 -> 정수 안됨
		
		double result = 0;
		result = (double)num1 + num2; //변수의 범위 int < double. 형변환
		System.out.println("결과: " + result);
		
		//변수의 조율.
		// 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
		// 실수 : float(4byte), double(8byte)
		// boolean : true / false
		// 객체(문자)(클래스): 문자형(String - 크기가 없음)
		// byte : 8bit -> 2^8; 2의 8승 : -128 ~ 127 범위 담을 수 있음.
		System.out.println(Integer.MAX_VALUE); //- 2147483647 ~ 0 ~ 2147483647 담을 수 있는 값. 범위
		byte b1 = 127;
		short s1 = 128;
		long l1 = 2147483648L; // 정수의 기준 int long 타입은 마지막 숫자 뒤에 L 붙여줘야함.  int 정수 범위 벗어날 경우
		//자바에서 정수연산을 하면 기준이 int.
		long result1 = (long) b1 + (long) s1 + l1; // 결과값은 int 정수로 나와야됨.
		
		b1++; // b1 = b1 + 1; 같은 말
		System.out.println("b1의 값: " + b1);
	}
	
}
