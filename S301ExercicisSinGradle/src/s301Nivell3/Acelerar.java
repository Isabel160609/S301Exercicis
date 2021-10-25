package s301Nivell3;

public class Acelerar implements IAccion{
	Vehicle vehicle;
	
	
	public Acelerar(Vehicle vehicle) {
		this.vehicle=vehicle;
	}

	@Override
	public void execute() {
		
		this.vehicle.acelerar();;
	}

}
