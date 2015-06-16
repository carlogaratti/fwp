package main;

public class And extends Condition {

	private Condition _condition1;
	private Condition _condition2;

	public And(Condition condition1, Condition condition2) {
		_condition1 = condition1;
		_condition2 = condition2;
	}

	@Override
	public boolean inspect(Hotel hotel) {
		return _condition1.inspect(hotel) &&  _condition2.inspect(hotel);
	}

}
