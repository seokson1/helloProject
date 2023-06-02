package com.yedam.object;

public class Student {
	private String stNum;
	private String name;
	private String gender;
	private int score;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void showInfo() {
		System.out.printf("학번 %s, 이름 %s, 점수 %d \n", stNum, name, score);
	}
}
