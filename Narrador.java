
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Narrador {
	
	
	public static int escenaActual = 0;
	
	static List<Escena> allEscenas = new ArrayList<Escena>();
	public static int intSeleccion;
	public static class Escena{
		public int idEscena;
		public String narrativa;
		public Object[] opciones;
		
	}
		
	public static void main(String[] args) {
		
		Escena escena0 = new Escena();
		escena0.idEscena = 0;
		escena0.narrativa = "Narrativa 0";
		escena0.opciones = new Object[] {"op0", 2, "op10", 3}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena0);
				
		Escena escena1 = new Escena();
		escena1.idEscena = 1;
		escena1.narrativa = "Narrativa 1";
		escena1.opciones = new Object[] {"op1", 2, "op2", 5}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena1);
		//System.out.println(escena1.opciones[4]);
		
		Escena escena2 = new Escena();
		escena2.idEscena = 2;
		escena2.narrativa = "Narrativa 2";
		escena2.opciones = new Object[] {"op12", 6, "op22", 1};
		allEscenas.add(escena2);
		
		//System.out.println(allEscenas.get(escenaActual).idEscena);
		narracion();
	}
	
	
	public static void narracion() {
		System.out.println("\n"+getEscena()+"\n");
		System.out.println("a) "+getOpciones()[0]);
		System.out.println("b) "+getOpciones()[2]);
		/*for(int i = 0; i < getOpciones().length; i = i+2) {
			System.out.println(getOpciones()[i]);
		}*/
		
		promptPlayer();
	}
	
	public static void setEscena(String seleccion) {
		//System.out.println(allEscenas.get(escenaActual).opciones[0]);
		
		if (seleccion.equals("a")) {
			intSeleccion = 1;
		}else if (seleccion.equals("b")){
			intSeleccion = 3;
		}else {
			System.out.println("Elige una opci�n adecuada.");
			//setEscena(escenaActual); AC� VOY
		}
		System.out.println(allEscenas.get(escenaActual).opciones[intSeleccion]);
		escenaActual = (int) allEscenas.get(escenaActual).opciones[intSeleccion]; // Casting (conversi�n de tipos de datos)		
		narracion();
		//
	}
	
	public static String getEscena() {
		return allEscenas.get(escenaActual).narrativa;
	}
	
	public static Object[] getOpciones() {
		return allEscenas.get(escenaActual).opciones;
	}
	
	public int getIdEscena() {
		return escenaActual;
	}
	
	public static void promptPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nElige una opci�n:\n");
		String seleccion = scanner.nextLine();
		
		setEscena(seleccion);
		scanner.close();
	}

	public void generarCombateAleatorio() {
		
	}
	
	public void lanzarDados() {
		
	}
	
	public void recompensaAleatoria() {
		
	}
	
	public void comandoHelp() {
			
	}
}
