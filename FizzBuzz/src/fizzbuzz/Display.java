package fizzbuzz;

public class Display {

	private StringBuffer _aString = new StringBuffer();

	public void show(String aString) {
		_aString.append(aString);
	}

	public String get() {
		return _aString.toString() ;
	}

}
