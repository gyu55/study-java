package interfaceTask1;

public class PersonActionAdapter extends Person implements PersonAction{
	
	public PersonActionAdapter() {;}
	
	public PersonActionAdapter(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {;}
	
	@Override
	public void school() {;}
	
	@Override
	public void work() {;}
}
