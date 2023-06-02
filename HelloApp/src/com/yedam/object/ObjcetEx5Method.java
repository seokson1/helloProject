package com.yedam.object;

// main에 사용하려면 메모리상에 생성되어야 사용 가능함.
// static 넣으면 메모리 상에 미리 넣었기 때문에 인스턴스 사용하지 않아도 main에서 바로 사용 가능함.
//static < - > instance.
public class ObjcetEx5Method {
	// static 정적 메소드
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = sum(num1, num2);
		double result1 = div(num1, num2);
		result = sum(new int[] {1,2,3});
		
		System.out.println(result);
		
//		ObjcetEx5Method o1 = new ObjcetEx5Method(); // 메모리에 로딩. 인스턴스 생성
//		int result = o1.sum(num1, num2);
		//메소드 호출.
		makePerson("홍길동", 20);
		int[] resultAry = makeAry(10);
			showNumber(resultAry);
		}
	

	// instance method. - 실체가 있어야 가능. 메모리에 준비 되어 로딩 되어야 함.
	// 메모리에 사용할 준비가 되어 있는 지 -> main 사용 가능함.
	// method overloading; 재정의 . 매개값이 다르면 같은 메서드 명 사용 가능함.
	// 매개 값이 중요함.
	// 메소드 정의
	public static void showNumber(int[] ary) {
		for(int num : ary) {
			System.out.println(num);
		}
	}
	
	public static Person makePerson(String name, int age) {
		return new Person(name, age);
	}
	public static int[] makeAry(int size) {
		int[] ary = new int[size];
		for(int i=0; i<ary.length; i++) {
			ary[i] = (int)(Math.random() *10);
		}
		return ary;
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
//	public static double sum(int m, int n) {
//		return (double) m+n;  -> 이걸 경우 매개값이 같아서 오류. 매개 변수의 타입 변경 등 같지 않게 만들어야함.
//		
//	}
	public static int sum(int[] ary) {
		int result = 0;
		for(int num : ary) {
			result += num;
		}
		return result;
	}

	public static double div(int n1, int n2) {
		return (double) n1 / n2;
	}
}
