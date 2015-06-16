package main;

public class Not extends Condition{

	private Condition _condition;

	public Not(Condition condition) {
		_condition = condition;
	}

	@Override
	public boolean inspect(Hotel hotel) {
		return !_condition.inspect(hotel);
	}

}
