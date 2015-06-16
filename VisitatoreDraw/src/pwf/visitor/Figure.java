package pwf.visitor;


public abstract class Figure {
	
	public abstract void accept(Visitor visitor);
	
	public Figure add(Figure figura) {
		return new FiguraComposta(this, figura);
	}
	





}
