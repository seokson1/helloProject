package com.yedam.classes;

// 대문자 시작. class 관례 data: int[] : 필드.
// 기능 : 전체출력
//		 합계
//		 최대값
public class KorScore {
	
	// (인스턴스) 필드 메서드 아니면 다 필드라고 함. 정보를 담기 위한 것.
	int[] kor = new int[] {100, 80, 70};
	
	KorScore() {
		
	}
	//생성자. 기본생성자 = KorScore() {}
//	KorScore(int[] scores){
//		kor = scores;
//	}
	
	//(인스턴스) 메소드.<- static 없는 메소드 부를 때 (동작)
	public void print() {
		for (int score : kor) {
			System.out.println(score);
		}
	}

	public void total() {
		int sum = 0;
		for (int score : kor) {
			sum += score;
		}
		System.out.println(sum);
	}

	public void max() {
		int max = 0;
		for (int score : kor) {
			if (max < score) {
				max = score;
			}
		}
		System.out.println(max);
	}
}
