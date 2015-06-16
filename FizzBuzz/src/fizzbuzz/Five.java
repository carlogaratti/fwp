package fizzbuzz;

public class Five extends Node{
	

	private Display _display;


	public Five(Display display, Node five) {
		super(five);
		_display = display;
	}


	@Override
	protected void core(int i) {
		if (i % 5 == 0)	_display.show("Buzz");
		
	}
}
