package pwf.visitor;

public class CountFormeVisitor extends Visitor{
	int total = 0;
	
	public void visit(Figure figure) {
		this.total += 1;
	}
	
	public int total(){
		return this.total;
	}

	@Override
	public void visitTrapezio(Trapezio figure) {
		visitTrapezio(figure);
		
	}

	@Override
	public void visitTriangle(Triangle figure) {
		visit(figure);
		
	}

	@Override
	public void visitRectangle(Rectangle figure) {
		visit(figure);
		
	}

}
