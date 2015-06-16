package pwf.visitor;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure {

	private int base;
	private int altezza;

	public Rectangle(int base, int altezza) {
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
