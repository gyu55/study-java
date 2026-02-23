package classTask3;

import java.util.Scanner;

// 동물 연구소 클래스
// checkAnimal(){}
//각각 동물이 들어오면 어떤 동물에 속하는지 출력해주는 메서드

// 동물들이 들어오면 각각의 동물들을 분리한다.
// 초식동물(Harbivore)
//- 코알라, 사슴

// 육식동물(Carnivore)
//- 사자, 곰

// 잡식동물(Omivore)
//- 강아지, 고양이

public class ClassTask3 {
	public static void main(String[] args) {
		AnimalLab lab = new AnimalLab();
		Scanner sc = new Scanner(System.in);
		String ani = sc.next();
		if(ani.equals("사슴") || ani.equals("코알라")) {
			lab.checkAnimal(new Harbivore());
		}else if(ani.equals("사자") || ani.equals("곰")) {
			lab.checkAnimal(new Carnivore());
		}else if(ani.equals("강아지") ||ani.equals("고양이")) {
			lab.checkAnimal(new Omivore());
		}else {
			System.out.println("잘못입력");
		}
	}
}