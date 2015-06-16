package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Composto extends Componente {
	
	List<Componente> list = new ArrayList<Componente>();
	
	@Override
	public void price(Cestino cestino) {
		int total = 0;
		for (Componente componente : list) {
			componente.price(cestino);
		}
	}

	public void add(Componente componente){
		list.add(componente);
	}
	
	
	

}
