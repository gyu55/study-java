package classTask2;

public class RPGGame {
	public void checkMonster(Monster monster) {
		if (monster instanceof Human) {
			Human human = (Human) monster;
			human.attack();
			human.dropItem();
			human.getItem();
			human.getGold();
		} else if (monster instanceof Ork) {
			Ork ork = (Ork) monster;
			ork.attack();
			ork.dropItem();
			ork.getItem();
			ork.getGold();
			
		} else if (monster instanceof Fairy) {
			Fairy fairy = (Fairy) monster;
			fairy.attack();
			fairy.dropItem();
			fairy.getItem();
			fairy.getGold();
		}
	}
}
