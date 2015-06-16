package main;

public class BlueNode extends ANode {

	private Display _display;
	
	public BlueNode(ANode nodeDebug, Display display) {
		super(nodeDebug);
		_display = display;
	}


	
	@Override
	protected void execute(String aTime) {
		_display.show(aTime + " blu");		
	}


	@Override
	protected boolean isMine(String aTime) {
		int now = Integer.parseInt(aTime);
		int bottom = 1500;
		int top = 600;
		if (now > bottom && now < 2400) return true;
		if (now < top ) return true;
		return false;
	}

}
