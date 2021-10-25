package s301Nivell3;

public class Arrancar implements IAccion{
	Vehicle vehicle;
	
	
	public Arrancar(Vehicle vehicle) {
		this.vehicle=vehicle;
	}

	@Override
	public void execute() {
		
		this.vehicle.arrancar();
	}

}
