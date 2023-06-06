package com.yedam.classes;

// 라이브러리 클래스.
// Object 상속.
public class Department {

	// 필드.
	private int departmentId; // 부서 번호
	private String departmentName; // 부서 명
	private int managerId; // 부서장

	// 생성자.
	// 기본생성자.
	Department() {

	}

	// 부서번호 초기화.
	Department(int departmentId) {
		this.departmentId = departmentId;
	}

	// 부서번호, 부서명 초기화.
	Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	// 부서번호, 부서명, 부서장 초기화
	Department(int departmentId, String departmentName, int managerId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	//메소드

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	// 부모클래스의 기능 상속.... 
	@Override
	public String toString() {
//		return super.toString(); 부모 (object) toString() 실행.
		return "부서번호: " + departmentId + ", " + "부서명: " 
				+ departmentName + ", " + "부서장: " + managerId;
	}
}
