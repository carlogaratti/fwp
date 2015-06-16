package main;

public class Client {

	private int _age;
	private Person _person;

	public Client( Person person) {
		_person = person;
	}

	public void askAge() {
		_age = _person.age();
		
	}

	public int display() {
		return _age;
	}

}
