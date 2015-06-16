package main;

public class Starter {
	
	public static void main(String[] args) {
		ANode watch = createClock();
		watch.its("0000");
		watch.its("0352");
		watch.its("0726");
		watch.its("1401");
		watch.its("1500");
		watch.its("2400");
		
	}

	private static ANode createClock() {
		Display display = new Display();
		ANode nodeDebug = new DebugNode();
		ANode node3 = new BlueNode(nodeDebug, display);
		ANode node2 = new VoidNode(node3, display);
		ANode node1 = new RedNode(node2, display);
		return node1;
	}

}
