package s301Nivell3;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List <IAccion> acciones = new ArrayList<IAccion>();
	
	public void recibirAcciones(IAccion accion) {
		acciones.add(accion);
	}
	
	public void realizarAcciones() {
		this.acciones.forEach(x->x.execute());
		this.acciones.clear();
	}
}
