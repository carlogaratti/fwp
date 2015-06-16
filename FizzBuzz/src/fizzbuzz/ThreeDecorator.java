package fizzbuzz;

public class ThreeDecorator extends Node{

	private Display _display;


	public ThreeDecorator(Display display, Node node) {
		super(node);
		_display = display;
	}
	

	@Override
	protected void core(int i) {
		if (i % 3 == 0)	_display.show("");
		
	}

}
