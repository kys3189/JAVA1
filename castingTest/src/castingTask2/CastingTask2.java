package castingTask2;

import java.util.Scanner;

public class CastingTask2 {
	public static void main(String[] args) {
//		오크, 요정, 인간을 사냥
//		오크 : 가죽을 얻는다.
//		요정 : 날개을 얻는다.
//		인간 : 갑옷을 얻는다.
		
		Scanner sc = new Scanner(System.in);
		Character hero = new Character("척준경", "검사", 10);
		Ork 오크 = new Ork();
		Fairy 요정 = new Fairy();
		Human 인간 = new Human();
		
		int userInput = 0;
		
		System.out.println("당신의 이름은 " + hero.name + "입니다.");
		System.out.println("당신의 앞에 오크, 요정, 인간이 나타났습니다. 무엇을 사냥하시겠습니까?");
		System.out.println("1. 오크\n2. 요정\n3. 인간");
		
		userInput = sc.nextInt();
		
		if (userInput == 1) {
			hero.hunting(오크);
			hero.level++;
		} else if(userInput == 2) {
			 hero.hunting(요정);
			 hero.level++;
		} else if(userInput == 3) {
			hero.hunting(인간);
			hero.level++;
		} else {
			System.out.println("당신이 원하는 몬스터를 찾지 못했습니다.");
		}
		
		System.out.println("당신의 현재 레벨 : " + hero.level);
		
	}
}
