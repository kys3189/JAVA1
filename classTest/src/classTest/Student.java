package classTest;

import java.util.Scanner;

public class Student {
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력 받고
//	총점과 평균을 출력하기
	int studentNum;
	String name;
	int krScore;
	int enScore;
	int mtScore;
	static int allScore;
	int scoreAverage;
	
	public Student() {;}
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
		this.scoreAverage = this.allScore / 3;
	}
	
	public static void main(String[] args) {
		
		Student sd = new Student(20192019, "김영수");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		sd.krScore = sc.nextInt();
		sd.allScore += sd.krScore;
		System.out.println("영어 점수를 입력하세요.");
		sd.enScore = sc.nextInt();
		sd.allScore += sd.enScore;
		System.out.println("수학 점수를 입력하세요.");
		sd.mtScore = sc.nextInt();
		sd.allScore += sd.mtScore;
		
		System.out.println(sd.allScore);
		System.out.println(sd.scoreAverage);
		
	}
	
}
