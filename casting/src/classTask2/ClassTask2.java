package classTask2;

public class ClassTask2 {

//	게임 시스템
//	캐릭터는 몬스터를 사냥할 수 있다.
//	몬스터
//	오크, 요정, 휴먼
//	오크를 사냥하면 "오크가 달려든다!"를 출력
//	"가죽 얻는다."를 출력
	
//	요정을 사냥하면
//	"요정이 마법을 사용한다"를 출력
//	"날개를 얻는다"를 출력
	
//	휴먼을 사냥하면
//	"휴먼이 숨는다"를 출력
//	"갑옷을 얻는다"를 출력
	
	public static void main(String[] args) {
		RPGGame rpg = new RPGGame();
		
		Character ch1 = new Character(1, "규호", 0, "");
		rpg.checkMonster(new Ork());
		ch1.levelUp();
		System.out.println("==========================================");
		rpg.checkMonster(new Fairy());
		ch1.levelUp();
		System.out.println("==========================================");
		rpg.checkMonster(new Human());
		ch1.levelUp();
		System.out.println("==========================================");
		ch1.showItem();
	}
}
