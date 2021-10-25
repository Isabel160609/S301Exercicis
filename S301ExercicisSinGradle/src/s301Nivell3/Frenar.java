package s301Nivell3;

public class Frenar implements IAccion{
	Vehicle vehicle;
	
	
	public Frenar(Vehicle vehicle) {
		this.vehicle=vehicle;
	}

	@Override
	public void execute() {
		
		this.vehicle.frenar();
	}

}
