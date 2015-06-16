package main.inspectreturnvoid;


public class And extends CompositeCondition{
	
	@Override
	public void inspect(Hotel hotel, Display display) {
		boolean result = true;
		display.result(true);
		for (Condition contidion : _conditions){
			
			boolean beforeResult = display.result();
			System.out.println("in ANd before" + beforeResult);
			contidion.inspect(hotel, display);
			result = beforeResult && display.result();
			System.out.println("in ANd after" + beforeResult);
			display.result(result);
		}
	}

}
