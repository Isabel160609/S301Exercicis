package S301Nivell2;

public class PaisDesconocido  implements Interface1digito,Interface2digitos{

	@Override
	public String getTelefono(int telefono) {
		String mensaje="no se encontro este tipo de contacto";
		return mensaje;
	}

	@Override
	public String getDireccion(String calle, String tipo, int numero, int cp) {
		String mensaje="no se encontro este tipo de contacto";
		return mensaje;
	}

}
