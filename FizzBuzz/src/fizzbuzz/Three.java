package fizzbuzz;

public class Three extends Node{


	private Display _display;

	public Three(Display display, Node node) {
		super(node);
		_display = display;
	}

	@Override
	protected void core(int i) {
		 if (i % 3 == 0) _display.show("Fizz");
		
	}

}
