package main;

public class Starter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hotel myHotel = new Hotel();
		Spec terminalSpecIsNearMetro = new TerminalSpecIsNearMetro();
		Spec terminalSpecIsNearTram = new TerminalSpecIsNearTram();
		NonTerminalSpec orTransportation = new NonTerminalSpecOR();
		orTransportation = orTransportation.add(terminalSpecIsNearTram).add(terminalSpecIsNearMetro);
		//System.out.println(orTransportation.evalutate(myHotel));
		Spec cheapSpec = new TerminalSpecIsChaep();
		TerminalSpecIsChaep.SOGLIA = 9;
		NonTerminalSpec andOne = new NonTerminalSpecAND();
		andOne.add(orTransportation).add(cheapSpec);
		andOne.evalutate(myHotel);
	}
}
