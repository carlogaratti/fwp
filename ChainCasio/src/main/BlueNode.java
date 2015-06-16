package main;

public class BlueNode extends ANode{

	public BlueNode(RedNode redNode) {
		super("0600", "1200");
		_next = redNode;
	}

	@Override
	public void execute() {
		System.out.println("BLUE");
	}

}
