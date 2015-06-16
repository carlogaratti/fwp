package main;

public class Starter {
	public static void main(String[] args) {
		Or or = new Or();
		
		
		or.add(new NearMetro()).add (new NearTram());
		And and = new And();
		and.add(new Costoso()).add(or);
		System.out.println(and.inspect(new Hotel()));
		
		Condition albergoPiuComodo = new NearMetro().or(new Not(new NearTram())).and(new Not(new Costoso()));
		Hotel hotel = new Hotel();
		new NearMetro().inspect(hotel);
		albergoPiuComodo.inspect(hotel);
	}
}
