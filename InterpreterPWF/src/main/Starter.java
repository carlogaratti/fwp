package main;

public class Starter {
	public static void main(String[] args) {
		//Condition albergoPiuComodo = new NearMetro().or(new Not(new NearTram())).and(new Not(new Costoso()));
		//Hotel hotel = new Hotel();
		//new NearMetro().inspect(hotel);
		//albergoPiuComodo.inspect(hotel);
		//firstScenario();
		//secondScenario();
		//terzoscenario();
		ultimoScenario();
	}

	private static void firstScenario() {
		Condition albergoNonIlPiuCostoso = new Not(new Costoso());
		Hotel hotel = new Hotel();
		System.out.print("deve essere true: ");
		System.out.print(albergoNonIlPiuCostoso.inspect(hotel) + "\n");	
	}
	
	private static void secondScenario() {
		Condition albergoNotNearTram = new Not(new NearTram());
		Hotel hotel = new Hotel();
		System.out.print("deve essere false: ");
		System.out.print(albergoNotNearTram.inspect(hotel) + "\n");	
	}
	
	private static void terzoscenario() {
		Condition albergoNonIlPiuCostoso = new Not(new Costoso());
		Condition albergoNotNearTram = new Not(new NearTram());
		Condition andCondition = (albergoNotNearTram).and(albergoNonIlPiuCostoso);
		Hotel hotel = new Hotel();
		System.out.print("deve essere true: ");
		System.out.print(andCondition.inspect(hotel) + "\n");
	}
	
	private static void ultimoScenario() {
		Hotel hotel = new Hotel();
		Condition albergoNonIlPiuCostoso = new Not(new Costoso());
		System.out.println(albergoNonIlPiuCostoso.inspect(hotel));
		Condition albergoNotNearTram = new Not(new NearTram());
		System.out.println(albergoNotNearTram.inspect(hotel));
		Condition andCondition = (albergoNotNearTram).and(albergoNonIlPiuCostoso);
		System.out.println(andCondition.inspect(hotel));
		Condition albergoPiuComodo = new NearMetro().or(andCondition);
		System.out.println(albergoPiuComodo.inspect(hotel));
	}
	
	
}
