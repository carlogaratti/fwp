package main;

public class Starter {
	public static void main(String[] args) {
		ANode blueNode = createNode();
		blueNode.its("0726");
		blueNode.its("1500");
		blueNode.its("1900");
	}

	private static ANode createNode() {
		return new BlueNode(new RedNode(new WhiteNode(new DebugNode())));
	}
}
