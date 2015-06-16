package pwf.visitor;

import java.util.ArrayList;
import java.util.List;

public class Trapezio extends Figure{
	
	private int baseMaggiore;
	private int baseMinore;
	private int altezza;
	
	public Trapezio(int baseMaggiore, int baseMinore, int altezza) {
		this.baseMaggiore = baseMaggiore;
		this.baseMinore = baseMinore;
		this.altezza = altezza;
	}
	
	public int baseMaggiore(){
		return baseMaggiore;	
	}
	
	public int baseMinore(){
		return baseMinore;
	}
	
	public int altezza(){
		return altezza;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTrapezio(this);
		
	}
	
	
	
}
