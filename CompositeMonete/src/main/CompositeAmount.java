package main;

import java.util.ArrayList;
import java.util.List;

public class CompositeAmount extends Amount {
	
	private List<Amount> list = new ArrayList<Amount>();
	
	@Override
	public int total() {
		int result = 0;
		for (Amount amount : list) result += amount.total();
		return result;
	}
	
	public void add(Amount amount) {
		list .add(amount);
	}

}
