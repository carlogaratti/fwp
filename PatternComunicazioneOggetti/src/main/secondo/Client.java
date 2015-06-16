package main.secondo;

public class Client {

	private int _age;
	private Person _person;

	public Client( Person person) {
		_person = person;
	}

	public void askAge(StringBuffer sb) {
		_person.age(sb);
		
	}

}
