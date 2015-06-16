package main;

public class RedNode extends ANode{

	public RedNode(ANode aNode) {
		super("1200", "1800");
		_next = aNode;
	}

	@Override
	public void execute() {
		System.out.println("RED");
	}

}
