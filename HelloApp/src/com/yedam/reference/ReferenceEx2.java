package com.yedam.reference;

import java.lang.reflect.Array;

public class ReferenceEx2 {

	public static void main(String[] args) {
		// int s1 = 90; int s2 = 80; .... int s20 = 90; 배열 사용 하지 않음 경우..
		int[] intAry = {30, 40, 50};
		double[] dblAry = {30, 40, 50};
		String[] strAry = {"H", "E", "L", "L","O"};
		int[] intAry2 = new int[3]; // 0 ,0 ,0 들어가 있음. 초기값.
		
		// 배열의 크기는 한번 정해지면 불면.
		
		//intAry[3] = 33;
		System.out.println(intAry2[0]);
		intAry2[0] = 33;
		System.out.println(intAry2[0]);

		int sum = intAry[0] + intAry[1] + intAry[2];
		
		sum =0;
		for(int i=0; i<3; i++) {
			sum += intAry[i];
		}
		// 확장 for
		for(String str : strAry) {
			System.out.print(str);
			
		}
		System.out.println();
		System.out.println("sum: " + sum);
		
		double sum1 = dblAry[0] + dblAry[1] + dblAry[2];
		
		System.out.println(sum);
		System.out.println(sum1);
	}

}
