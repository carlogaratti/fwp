package main;

public class RedNode extends ANode {

	private Display _display;
	
	public RedNode(ANode next, Display display) {
		super(next);
		_display = display;
	}
	
	@Override
	protected void execute(String aTime) {
		_display.show(aTime + " red");
		
	}

	@Override
	protected boolean isMine(String aTime) {
		int now = Integer.parseInt(aTime);
		int bottom = 600;
		int top = 1200;
		if (now > bottom && now <= top) return true;
		return false;
	}

}
