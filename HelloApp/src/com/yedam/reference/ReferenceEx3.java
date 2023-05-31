package com.yedam.reference;

public class ReferenceEx3 {

	public static void main(String[] args) {
		// 학생 점수: 89.5, 78.9, 90.4 값을 저장. sum , avg 구하기

		double[] arrStu = { 89.5, 78.9, 90.4 };
		arrStu = new double[] {55.5, 66.6,88.8 ,77.7 };
		double maxVal = 0;
		double sum = 0;
		int cnt =0;
		for (double num : arrStu) {
			sum += num;
			cnt++;
		}
		for(int i=1; i<arrStu.length; i++) {
			if(arrStu[0] < arrStu[i]) {
				arrStu[0] = arrStu[i];
			}
			maxVal = arrStu[0];
		}
		System.out.println(maxVal);
		System.out.println(cnt);
		System.out.println("합계 값은 : " + sum);
		double avg = sum/cnt;
		System.out.println("평균값은 : " + avg);
		System.out.printf("합계점수는 %.2f, 평균은 %.2f, 최고값은 %.2f 입니다.", sum,avg, maxVal);
	}

}
