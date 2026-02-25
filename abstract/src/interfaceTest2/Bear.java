package interfaceTest2;
// CarnivoreMarker -> 타입을 주는 용도 (마커용도)
public class Bear extends Animal implements CarnivoreMarker{
	
	public Bear() {;}
	public Bear(String name) {
		super(name);
	}
	
}
