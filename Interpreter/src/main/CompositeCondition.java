package main;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeCondition extends Condition{
	protected List<Condition> _conditions = new ArrayList<Condition>();

	public CompositeCondition add(Condition condition){
		_conditions.add(condition); return this;
	}

}
