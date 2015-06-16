package main;

public class NonTerminalSpecAND  extends NonTerminalSpec {

	public boolean evalutate(Hotel myHotel) {
		boolean  result = true;
		for (Spec spec : _list) {
			// System.out.println("ciclo AND " + result + "  spec.evalutate(myHotel) " +  spec.evalutate(myHotel));
			 result = result && spec.evalutate(myHotel) ;
		}
		System.out.println("result of AND " + result);
		return result;
	}

}
