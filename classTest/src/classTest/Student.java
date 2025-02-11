package classTest;

import java.util.Scanner;

public class Student {
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력 받고
//	총점과 평균을 출력하기
	
	int studentNum;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	public Student() {;}
	
	public Student(int studentNum, String name, int kor, int eng, int math) {
		this.studentNum = studentNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total / 3.0;
	}
	
	public static void main(String[] args) {
		
		
		Student 김영수 = new Student(1, "김영수", 63, 84, 55);
		System.out.println("학점의 평균 : " + 김영수.average);
		
	}
	
}
