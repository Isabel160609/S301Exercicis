package S301Nivell2;

public class ConexionRusia implements Interface2digitos{
	String pais;
	public ConexionRusia(){
		this.pais="EEUU";
	}
	@Override
	public String getTelefono(int telefono) {
		String telefonoCompleto ="+7"+telefono;
		return telefonoCompleto;
		
	}

	@Override
	public String getDireccion(String calle, String tipo, int numero, int cp) {
		String direccion=calle+ " "+tipo+" "+numero+" "+cp + pais;
		return direccion;
	}

}
