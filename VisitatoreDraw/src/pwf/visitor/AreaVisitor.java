package pwf.visitor;

public class AreaVisitor extends Visitor {

	private int total;

	@Override
	public void visitTriangle(Triangle triangle) {
		this.total += (triangle.altezza() * triangle.base()) /2;
		
	}
	
	@Override
	public void visitTrapezio(Trapezio trapezio) {
		this.total += ((trapezio.baseMaggiore() + trapezio.baseMinore()) * trapezio.altezza()) / 2;
		
	}

	@Override
	public void visitRectangle(Rectangle rectangle) {
		total += rectangle.altezza() * rectangle.base();
		
	}

	

	public int total() {
		return this.total;
	}

}
