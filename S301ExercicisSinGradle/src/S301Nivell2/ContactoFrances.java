package S301Nivell2;

public class ContactoFrances implements Interface1digito{
	
	String pais;
	
	public ContactoFrances(){
		this.pais="Francia";
	}
	

	@Override
	public String getTelefono(int telefono) {
		String telefonoCompleto ="+33"+telefono;
		return telefonoCompleto;
		
		
	}

	@Override
	public String getDireccion(String calle, String tipo, int numero, int cp) {
		
		String direccion=tipo+" "+calle+ " "+numero+" "+cp + pais;
		return direccion;
		
		
	}

}
