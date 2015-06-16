package main;

public class DebugNode extends ANode {


	public DebugNode(ANode node) {
		super(node);
	
	}

	public DebugNode() {
		super(null);
	}

	@Override
	protected void execute(String aTime) {
		System.out.println("Unhandled: " + aTime);
	}

	@Override
	protected boolean isMine(String aTime) {
		return true;
	}

}
