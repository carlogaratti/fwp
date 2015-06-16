package main.quarto;

public class OggettoCheSaFare {

	private StringBuffer _sb;

	public OggettoCheSaFare(StringBuffer sb) {
		_sb = sb;
	}

	public void activateOn( int age) {
		_sb.append(age);
		
	}

}
