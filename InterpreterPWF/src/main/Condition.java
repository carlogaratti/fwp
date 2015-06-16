package main;

public abstract class Condition {
	public abstract boolean inspect(Hotel condition);

	public  Condition and(Condition condition) {
		return new And(condition, this);
	}
	
	public  Condition or(Condition condition) {
		return new Or(condition, this);
	}

}
