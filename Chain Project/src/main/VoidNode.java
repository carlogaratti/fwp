package main;

public class VoidNode extends ANode {

	private Display _display;


	public VoidNode(ANode nullNode, Display display) {
		super(nullNode);
		_display = display;
	}

	@Override
	protected void execute(String aTime) {
		_display.show(aTime );
		
	}

	@Override
	protected boolean isMine(String aTime) {
		int now = Integer.parseInt(aTime);
		int bottom = 1200;
		int top = 1500;
		if (now > bottom && now <= top) return true;
		return false;
	}

}
