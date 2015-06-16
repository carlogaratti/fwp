package pwf.visitor;

public class DrawVisitor extends Visitor{

	private StringBuffer result = new StringBuffer();
	private Starter starter;
	private Activator activator;

	

	public DrawVisitor(Activator activator) {
		this.activator = activator;
	}

	

	@Override
	public void visitTrapezio(Trapezio figure) {
		result.append("new Trapezio(" + figure.baseMaggiore() + ", " + figure.baseMinore() + ", " + figure.altezza() + ")  \\n");
		activator.refresh(result.toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void visitTriangle(Triangle figure) {
		result.append("new Triangle(" + figure.base() + ", " + figure.altezza() + ")  \\n");
		activator.refresh(result.toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void visitRectangle(Rectangle figure) {
		result.append("new Rectangle(" + figure.base() + ", " + figure.altezza() + ")  \\n");
		activator.refresh(result.toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public StringBuffer show() {
		return result;
	}

}
