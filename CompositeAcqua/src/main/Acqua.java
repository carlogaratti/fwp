package main;

import java.util.ArrayList;
import java.util.List;

public class Acqua extends Component{
	List<Component> list = new ArrayList<Component>();
	
	public int size() {
		return list.size();
	}

	public void size(Display display) {
		int result = 0;
		for (Component aComponent : list) result += aComponent.size(); display.print(result);
		
	}

	public Acqua add(Component ancoraAcqua) throws Exception {
		list.add(ancoraAcqua); return this;
		
	}

}
