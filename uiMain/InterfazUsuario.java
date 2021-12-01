package uiMain;

import java.util.Scanner;

import gestorAplicacion.*;

public class InterfazUsuario {
	
	public static void inicio() {

	System.out.println("   ___|         |         |                                                   |              \\  |               |            \r\n"
			+ "  |       _` |  |   _` |  __ \\    _ \\ _  /   _ \\    __|       _ \\  __ \\       |   _` |        \\ |   _` |   __|  __ \\    _ \\  \r\n"
			+ "  |      (   |  |  (   |  |   |  (   |  /   (   | \\__ \\       __/  |   |      |  (   |      |\\  |  (   |  (     | | |  (   | \r\n"
			+ " \\____| \\__,_| _| \\__,_| _.__/  \\___/ ___| \\___/  ____/     \\___| _|  _|     _| \\__,_|     _| \\_| \\__,_| \\___| _| |_| \\___/\n");
	}
	
	public static void narracion() {
		System.out.println("\n"+gestorAplicacion.mecanicas.Narrador.getEscena()+"\n");
		System.out.println("a) "+gestorAplicacion.mecanicas.Narrador.getOpciones()[0]);
		System.out.println("b) "+gestorAplicacion.mecanicas.Narrador.getOpciones()[2]);
		/*for(int i = 0; i < getOpciones().length; i = i+2) {
			System.out.println(getOpciones()[i]);
		}*/
		
		promptPlayer();
	}
	
	public static void promptPlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nElige una opción:\n");
		String seleccion = scanner.nextLine();
		
		gestorAplicacion.mecanicas.Narrador.setEscena(seleccion);
		scanner.close();
	}
	
	public static void opcionInvalida() {
		System.out.println("Elige una opción válida.");
	}
	
	public static void comandoHelp() {
		System.out.println("\nComandos disponibles:\n\n"+
				"/help --- Mostrar los comandos disponibles\n"+
				"/save --- Guardar la partida en el estado actual\n"+
				"/exit --- Salir del juego\n"
			);
	}
	
	public static void comandoExit() {
		System.out.println("¡Hasta pronto!");
	}
	
	
}
