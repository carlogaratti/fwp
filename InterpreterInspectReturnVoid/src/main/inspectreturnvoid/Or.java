package main.inspectreturnvoid;


public class Or extends CompositeCondition{
	boolean result = false;
	
	public void inspect(Hotel hotel, Display display){
		display.result(false);
		for (Condition contidion : _conditions) {
			boolean beforeResult = display.result();
			contidion.inspect(hotel, display);
			result = beforeResult || display.result();
			display.result(result);
		}
	}
}
