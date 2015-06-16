package pwf.visitor;


public class Starter {
	public static void main(String[] args) {
		Activator activator = new Activator();
		activator.run();
		//primoScenarioCount();
		//primoScenarioDraw(activator);
		//secondoScenarioCount();
		secondoScenarioDraw(activator);
		//terzoScenarioCount();
		//terzoScenarioDraw(activator);
		
	}

	

	private static void terzoScenarioDraw(Activator activator) {
		Rectangle rectangle = new Rectangle(5,3);
		Trapezio trapezio = new Trapezio(2, 3, 4);
		Figure figure =  new Triangle(4,2).add(rectangle).add(trapezio);
		DrawVisitor draw = new DrawVisitor(activator);
		figure.accept(draw);
		System.out.println(draw.show());
		
	}

	private  static void secondoScenarioDraw(Activator activator) {
		Trapezio trapezio = new Trapezio(2, 3, 4);
		Figure figure =  new Rectangle(5,3).add(trapezio);
		DrawVisitor draw = new DrawVisitor(activator);
		figure.accept(draw);
		System.out.println(draw.show());
		
	}

	private static void primoScenarioDraw(Activator activator) {
		Triangle triangle = new Triangle(4,2);
		Figure figure =   new Trapezio(2, 3, 4).add(triangle);
		DrawVisitor draw = new DrawVisitor(activator);
		figure.accept(draw);
		System.out.println(draw.show());
		
	}

	private static void primoScenarioCount() {
		Triangle triangle = new Triangle(4,2);
		Figure figure =   new Trapezio(2, 3, 4).add(triangle);
		CountFormeVisitor count = new CountFormeVisitor();
		figure.accept(count);
		System.out.println(count.total());
		
	}

	private static void secondoScenarioCount() {
		Trapezio trapezio = new Trapezio(2, 3, 4);
		Figure figure =  new Rectangle(5,3).add(trapezio);
		CountFormeVisitor area = new CountFormeVisitor();
		figure.accept(area);
		System.out.println(area.total());
		
	}

	private static  void terzoScenarioCount() {
		Rectangle rectangle = new Rectangle(5,3);
		Trapezio trapezio = new Trapezio(2, 3, 4);
		Figure figure =  new Triangle(4,2).add(rectangle).add(trapezio);
		CountFormeVisitor area = new CountFormeVisitor();
		figure.accept(area);
		System.out.println(area.total());
	}


}
