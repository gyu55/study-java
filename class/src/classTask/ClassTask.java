package classTask;

// 스포츠(Sports) 추상화

class Sports {
	String name;
	int players;
	
//	기본 생성자
	public Sports() {;}
	
//	초기화 생성자
//	Shift + Alt + S  -> O 
	public Sports(String name, int players) {
		this.name = name;
		this.players = players;
	}
}

// 농구(BasketBall), 야구(BaseBall), 축구(Soccer)
// 객체화 -> 기본 생성자, 초기화 생성자 생성 후 초기화
public class ClassTask {
	public static void main(String[] args) {
		Sports soccer = new Sports("Soccer", 11);
		Sports basketBall = new Sports();
		Sports BaseBall = new Sports("BaseBall", 9);
		
		System.out.println(soccer.players);
	}
}
