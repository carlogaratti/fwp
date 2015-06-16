package main;

public abstract class ANode {

	protected ANode _next;
	protected ANode _next1;

	 public ANode(ANode node) {
		 _next = node;
	 }

	public void its(String aTime){
		 if(!isMine(aTime)) {
			_next.its(aTime);
			return;
		 }
		 execute(aTime);
	 }

	abstract protected void execute(String aTime);
	
	abstract protected boolean isMine(String aTime);
		 

}
