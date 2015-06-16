package main;


public class Or extends CompositeCondition{

	public boolean inspect(Hotel hotel){
		boolean result = false;
		for (Condition contidion : _conditions) {
			result = result || contidion.inspect(hotel);
		}
		return result;
	}
}
