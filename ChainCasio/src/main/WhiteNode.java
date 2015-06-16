package main;

public class WhiteNode extends ANode{


	public WhiteNode(DebugNode aNode) {
		super("1800", "2359");
		_next = aNode;
	}

	@Override
	public void execute() {
		System.out.println("WHITE");
		
	}

}
