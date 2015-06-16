package fizzbuzz;

public class FiveDecorator extends Node {

	private Display _display;


	public FiveDecorator(Display display, Node five) {
		super( five);
		_display = display;
	}
	

	@Override
	protected void core(int i) {
		if (i % 5 == 0 ) _display.show("");
		
	}

}
