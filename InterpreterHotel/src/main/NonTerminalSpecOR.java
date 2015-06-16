package main;

public class NonTerminalSpecOR extends NonTerminalSpec {

	@Override
	public boolean evalutate(Hotel myHotel) {
		boolean  result = false;
		for (Spec spec : _list) {
			 result = result | spec.evalutate(myHotel) ;
		}
		System.out.println("result of OR " + result);
		return result;
	}

}
