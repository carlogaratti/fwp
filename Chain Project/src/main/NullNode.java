package main;

public class NullNode extends ANode {


	public NullNode() {
		super(null);
	}

	@Override
	protected void execute(String aTime) {
		
	}

	@Override
	protected boolean isMine(String aTime) {
		return true;
	}

}
