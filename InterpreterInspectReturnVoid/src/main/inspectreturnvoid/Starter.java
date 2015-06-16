package main.inspectreturnvoid;

public class Starter {
	public static void main(String[] args) {
		Display display = new Display();
		Or or = new Or();
		or.add(new NearMetro()).add (new NearTram());
		And and = new And();
		and.add(new Costoso()).add(or);
		and.inspect(new Hotel(), display);
		System.out.println(display.result());
	}
}
