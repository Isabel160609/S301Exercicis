package S301Nivell2;

public class ContactoEspañol implements Interface1digito{
	
	String pais;
	
	ContactoEspañol(){
		this.pais="España";
	}
	

	@Override
	public String getTelefono(int telefono) {
		String telefonoCompleto ="+34"+telefono;
		return telefonoCompleto;
		
		
	}

	@Override
	public String getDireccion(String calle, String tipo, int numero, int cp) {
		
		String direccion=tipo+" "+calle+ " "+numero+" "+cp + pais;
		return direccion;
		
		
	}

}
