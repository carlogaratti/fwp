package main;


public class And extends CompositeCondition{
	
	@Override
	public boolean inspect(Hotel hotel) {
		boolean result = true;
		for (Condition contidion : _conditions) {
			result = result  && contidion.inspect(hotel);
		}
		return result;
	}

}
