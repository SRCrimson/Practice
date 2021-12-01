package gestorAplicacion.mecanicas; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uiMain.*;


public class Narrador {
	
	public static int escenaActual = 0;
	public static String[] comandos = new String[] {"/help", "/save", "/exit"};
	static List<Escena> allEscenas = new ArrayList<Escena>();
	public static int intSeleccion;
	
	// Dado de 20 caras
	static int min = 1;  
	static int max = 20;
	
	// Combate
	
	static int probabilidadCombate = 4; // 20%
	static boolean combate = false;  
			
	public static class Escena{
		public int idEscena;
		public String narrativa;
		public Object[] opciones;
		
	}
		
	public static void main(String[] args) {				
		lanzarDados();

		uiMain.InterfazUsuario.inicio();
		
		Escena escena0 = new Escena();
		escena0.idEscena = 0;
		escena0.narrativa = "Narrativa 0";
		escena0.opciones = new Object[] {"op0", 2, "op10", 3}; // El atributo impar es la narrativa de la opción y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena0);
				
		Escena escena1 = new Escena();
		escena1.idEscena = 1;
		escena1.narrativa = "Narrativa 1";
		escena1.opciones = new Object[] {"op1", 2, "op2", 5}; // El atributo impar es la narrativa de la opción y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena1);

		
		Escena escena2 = new Escena();
		escena2.idEscena = 2;
		escena2.narrativa = "Narrativa 2";
		escena2.opciones = new Object[] {"op12", 6, "op22", 1};
		allEscenas.add(escena2);
		

		uiMain.InterfazUsuario.narracion();
	}
	
	
	/*public static void narracion() {
		System.out.println("\n"+getEscena()+"\n");
		System.out.println("a) "+getOpciones()[0]);
		System.out.println("b) "+getOpciones()[2]);				
		promptPlayer();
	}*/
	
	public static void setEscena(String seleccion) {
		
		if (seleccion.equals("a")) {
			intSeleccion = 1;
			sets();
		}else if (seleccion.equals("b")){
			intSeleccion = 3;
			sets();
		}else if(Arrays.asList(comandos).contains(seleccion)) {
			comandos(seleccion);
		}
		else {
			
			uiMain.InterfazUsuario.opcionInvalida();
			uiMain.InterfazUsuario.narracion();		
		}		
	}
	
	public static void sets() {
		escenaActual = (int) allEscenas.get(escenaActual).opciones[intSeleccion]; // Casting (conversión de tipos de datos)		
		uiMain.InterfazUsuario.narracion();
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
	
	/*public static void promptPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nElige una opción:\n");
		String seleccion = scanner.nextLine();
		
		setEscena(seleccion);
		scanner.close();
	}*/

	public void generarCombateAleatorio() {
		if (lanzarDados() <= probabilidadCombate) {
			combate = true;
		};
		
	}
	
	public static int lanzarDados() {
		int resultadoDados = (int)(Math.random()*(max-min+1)+min);		
		return resultadoDados;
	}
	
	public static void comandos(String comando) {
		if (comando.equals("/help")) {
			uiMain.InterfazUsuario.comandoHelp();				
		}else if(comando.equals("/exit")) {
			uiMain.InterfazUsuario.comandoExit();
			System.exit(0);
		}else if(comando.equals("/save")) {
			// GUARDAR PARTIDA
		}
			
	}
	
	public static void combate() {
		/* ¿Cómo se desarrolla un combate? - Bosquejo
		 * Se determinan los involucrados en el combate. Siempre será el PJ vs una herencia de NPC.
		 * Se decide quién tiene el primer turno según quien tenga un puntaje de destreza mayor entre los contendientes
		 * En el turno del jugador, este podrá: Atacar con arma principal, atacar con hechizos (habilidad especial), usar objeto del inventario.
		 * En el turno del NPC este atacará y usará una habilidad especial cada x turnos
		 * - Cuando se ataca se determina si el golpe es exitoso o no de la siguiente manera: objetivo = 10 + nivel del atacante + clase de armadura del atacado - armadura del atacado, luego se lanza 1 dado de 20 caras, 
		 *   si el resultado es menor o igual al número obtenido de la sumatoria anterior, el golpe es exitoso y se procede a determinar el daño realizado.
		 * - El daño realizado es igual al daño del arma
		 * - Luego de calcular el daño realizado se termina el turno y comienza el del rival
		 * - El combate termina cuando uno de los combatientes obtiene HP menor o igual a 0. 
		 * */
	}

}
