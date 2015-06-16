package main.quarto;

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
		_oggettoCheSaFare.activateOn(_age);
	}
	public void oggettoCheSaFare(OggettoCheSaFare oggettoChesaFare) {
		_oggettoCheSaFare = oggettoChesaFare;
		
	}

}
