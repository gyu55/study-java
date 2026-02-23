package classTask3;

public class AnimalLab {
	public void checkAnimal(Animal animal) {
		if(animal instanceof Harbivore) {
			Harbivore harbi = new Harbivore();
			harbi.anim();
		}else if(animal instanceof Carnivore) {
			Carnivore carni = new Carnivore();
			carni.anim();
		}else if(animal instanceof Omivore) {
			Omivore omi = new Omivore();
			omi.anim();
		}
	}
}
