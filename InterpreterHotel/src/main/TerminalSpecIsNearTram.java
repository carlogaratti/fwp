package main;

public class TerminalSpecIsNearTram  extends Spec{

	public boolean evalutate(Hotel myHotel) {
		System.out.println(this);
		return myHotel.nearTram();
	}

}
