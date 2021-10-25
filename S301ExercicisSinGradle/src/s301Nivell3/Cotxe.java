package s301Nivell3;

public class Cotxe extends Vehicle{
	private String marca;
	
	
	public Cotxe(String marca) {
		super(marca);
		
	}
	@Override
	public void arrancar() {
		System.out.println("el coche "+ super.marca+" arranca");
		
	}
	@Override
	public void acelerar() {
		System.out.println("el coche "+ super.marca+"  acelera");
		
	}
	@Override
	public void frenar() {
		System.out.println("el coche "+ super.marca+" frena");
		
	}

}
