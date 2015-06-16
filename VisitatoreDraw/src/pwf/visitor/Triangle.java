package pwf.visitor;


public class Triangle extends Figure{
	
	private int base;
	private int altezza;

	public Triangle(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	
	}

	public int base(){
		return this.base;
	}
	
	public int altezza(){
		return this.altezza;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}


}
