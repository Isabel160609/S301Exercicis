package S301Nivell1;

import java.util.ArrayList;

public class Undo {
	

	private static Undo instancia;
	private static ArrayList<String>comandos=new ArrayList<String>();
	
	private Undo() {
		
	}
	

	public static Undo getInstancia() {
		if(instancia==null) {
			instancia=new Undo();
		}
		return instancia;
	}
	
	public int existeix(String comando) {
		int index=-1;
		int i=0;
		if(!comandos.isEmpty()) {
			while(i<comandos.size() && index<0) {
				if (comandos.get(i).equalsIgnoreCase(comando)) {
					index=i;
					
				}
				i++;
			}
		}
		return index;
	}
	
	public void afegir(String comando) {
		if(existeix(comando)==-1) {
			comandos.add(comando);
		}else {
			System.out.println("Aquest comando ya existeix");
		}
	}
	
	public void eliminar(String comando) {
		int index=existeix(comando);
		if(index>=0) {
			comandos.remove(index);
		}else {
			System.out.println("Aquest comando no existeix");
		}
		
	}
	public void veure(int posicion) {
		if(posicion<comandos.size()) {
			System.out.println(comandos.get(posicion));
		}else {
			
			System.out.println("Aquest comando no existeix");
		}
		
		
	}
	public void veureTots() {
		for(int i=0; i<comandos.size();i++) {
	        System.out.println(comandos.get(i));
			}
		
	}
	public void modificar(String comando,int posicion) {
		comandos.set(posicion, comando);
		
	}
}
