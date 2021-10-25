package S301Nivell2;

public class ConexionEEUU implements Interface2digitos{

	String pais;
	public ConexionEEUU(){
		this.pais="EEUU";
	}
	@Override
	public String getTelefono(int telefono) {
		String telefonoCompleto ="+1"+telefono;
		return telefonoCompleto;
		
	}

	@Override
	public String getDireccion(String calle, String tipo, int numero, int cp) {
		String direccion=calle+ " "+tipo+" "+numero+" "+cp + pais;
		return direccion;
	}

}
