package main.terzo;

public class Client {

	private int _age;
	private Person _person;

	public Client( Person person) {
		_person = person;
	}

	public void askAge() {
		_person.age();
		
	}
	
	

}
