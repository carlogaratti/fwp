package main;

import java.util.ArrayList;
import java.util.List;

public abstract class NonTerminalSpec extends Spec{

	
	protected List<Spec> _list = new ArrayList<Spec>();

	public NonTerminalSpec add(Spec spec){
		_list.add(spec);
		return this;
	}


}
