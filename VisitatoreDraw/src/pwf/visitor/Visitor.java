package pwf.visitor;

public abstract class Visitor {
	
	public void visit(Figure figure){
		if (figure instanceof Trapezio) visitTrapezio((Trapezio)figure);
		if (figure instanceof Triangle) visitTriangle((Triangle)figure);
		if (figure instanceof Rectangle) visitRectangle((Rectangle)figure);
	}


	public abstract void visitTrapezio(Trapezio figure);

	public abstract void visitTriangle(Triangle trapezio);
	
	public abstract void visitRectangle(Rectangle figure);

}
