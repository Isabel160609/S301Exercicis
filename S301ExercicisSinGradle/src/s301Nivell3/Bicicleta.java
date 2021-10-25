package s301Nivell3;

public class Bicicleta extends Vehicle{
	private String marca;
	
	
	public Bicicleta(String marca) {
		super(marca);
		
		
	}
	@Override
	public void arrancar() {
		System.out.println("la bicicleta "+ super.marca+"  arranca");
		
	}
	@Override
	public void acelerar() {
		System.out.println("la bicicleta "+ super.marca+"  acelera");
		
	}
	@Override
	public void frenar() {
		System.out.println("la bicicleta "+ super.marca+" frena");
		
	}

}
