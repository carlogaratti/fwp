package main;

public abstract class ANode {

	protected int _low;
	protected int _high;
	protected int current;
	protected ANode _next;
	protected ANode _secondNode;
	
	public ANode(String low, String high) {
		_low = Integer.parseInt(low);
		_high = Integer.parseInt(high);
	}

	public  void its(String aString){
		current = Integer.parseInt(aString);
		if (_low < current  && current < _high)	execute();
		else _next.its(aString);
	}

	public abstract void execute();

}
