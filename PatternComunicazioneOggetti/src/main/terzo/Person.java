package main.terzo;

public class Person {

	private int _age;
	private OggettoCheSaFare _oggettoCheSaFare;
	
	public Person() {
		_age = 37;
	}
	public int getAge(){
		return _age;
	}
	
	public void age() {
		_oggettoCheSaFare.activateOn(this);
	}
	public void oggettoCheSaFare(OggettoCheSaFare oggettoChesaFare) {
		_oggettoCheSaFare = oggettoChesaFare;
		
	}

}
