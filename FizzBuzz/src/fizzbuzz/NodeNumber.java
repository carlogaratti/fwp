package fizzbuzz;

public class NodeNumber extends Node{
	private Display _display;
	
	public NodeNumber(Display display, Node node) {
		super( node);
		_display = display;
	}

	
	@Override
	protected void core(int i) {
		if (!(i % 3 == 0) && !(i % 5 == 0))	_display.show(new Integer(i).toString());
	}

}
