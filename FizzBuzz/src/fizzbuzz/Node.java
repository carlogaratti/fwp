package fizzbuzz;

public abstract class Node {
	protected Node _node;
	
	public Node( Node node) {
		_node = node;
	}
	public void run(int i){
		core(i);
		if (_node!=null) _node.run(i);
	}
	abstract protected void core(int i);
}
