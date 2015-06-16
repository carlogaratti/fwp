package main;

public class DebugNode  extends ANode{

	public DebugNode() {
		super("0000", "1200");
		// TODO Auto-generated constructor stub
	}
	
	public  void its(String aString){
		System.out.println("LOGGAMI");
		DebugNode debugNode;
	}

	@Override
	public void execute() {
		System.out.println("LOG");
	}
	
}
