package main.terzo;

public class OggettoCheSaFare {

	private StringBuffer _sb;

	public OggettoCheSaFare(StringBuffer sb) {
		_sb = sb;
	}

	public void activateOn(Person person) {
		_sb.append(person.getAge());
		
	}

}
