package pwf.visitor;

import java.util.ArrayList;
import java.util.List;

public class FiguraComposta extends Figure {
	List<Figure> _list = new ArrayList<Figure>();
	
	public FiguraComposta(Figure... figures) {
		for (Figure each : figures)_list.add(each);
	}

	@Override
	public Figure add(Figure aFigure) {
		_list.add(aFigure);
		return this;
	}

	@Override
	public void accept(Visitor visitor) {
		for (Figure each : _list) {
			each.accept(visitor);
		}
	}
	
	public int count() {
		return _list.size();
	}

}
