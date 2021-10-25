package S301Nivell1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Undo miComando=Undo.getInstancia();
		
		 boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1:
	                		String comando=Teclado.leerString("que comando quieres introducir");
	                		miComando.afegir(comando);
	                        break;
	                case 2: 
	                		String comando2=Teclado.leerString("que comando quieres eliminar");
	                		miComando.eliminar(comando2);
	                        break;
	                case 3: 
	                		int posicion=Teclado.leerInt("que posicion quieres ver");
            				miComando.veure(posicion);
	                        break;
	                case 4: 
	                		
	                		miComando.veureTots();;
	                	
	                		break;
	                case 5: 
                			int posicion2=Teclado.leerInt("que posicion quieres modificar");
                			String comando3=Teclado.leerString("por que comando lo quieres sustituir");
                			miComando.modificar(comando3, posicion2);
                	
                		break;
	                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	    }
	   
	    public static byte menu(){
	        Scanner entrada = new Scanner(System.in);
	        byte opcio;
	        final byte MINIMO = 0;
	        final byte MAXIMO = 5;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1. afegir comando 1.");
	            System.out.println("2. eliminar comando2.");
	            System.out.println("3. veure comando 3.");
	            System.out.println("4. veure tots 4.");
	            System.out.println("5. modificar comando5.");
	            System.out.println("0. Sortir de l'aplicació.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	   
	    
	}

