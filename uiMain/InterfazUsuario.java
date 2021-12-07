package uiMain;

import java.util.Scanner;

import gestorAplicacion.*;
import gestorAplicacion.pjs.Player;

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
		System.out.println("\nElige una opci�n:\n");
		String seleccion = scanner.nextLine();
		
		gestorAplicacion.mecanicas.Narrador.setEscena(seleccion);
		scanner.close();
	}
	
	public static void opcionInvalida() {
		System.out.println("Elige una opci�n v�lida.");
	}
	
	public static void comandoHelp() {
		System.out.println("\nCOMANDOS\n\n"+
				"/help --- Mostrar los comandos disponibles\n"+
				"/save --- Guardar la partida en el estado actual\n"+
				"/exit --- Salir del juego\n"+
				"\nCOMANDOS EN COMBATE\n\n"+
				"/atacar --- Atacar con el arma equipada\n"+
				"/pocion --- Usar poción de curación\n"+
				"/escapar --- Intentar escapar del combate actual, 30% de probabilidad\n"
			);
	}

	public static void hojaPJ(){
		System.out.println("\nNombre del personaje: " + gestorAplicacion.pjs.Player.player.nombre +"\n"+
		"Nivel: " + gestorAplicacion.pjs.Player.player.nivel+"\n"+
		"Experiencia: " + gestorAplicacion.pjs.Player.player.xp+"\n"+
		"FUE: " + gestorAplicacion.pjs.Player.player.FUE+"\n"+
		"DES: " + gestorAplicacion.pjs.Player.player.DES+"\n"+
		"CON: " + gestorAplicacion.pjs.Player.player.CON+"\n"+
		"INT: " + gestorAplicacion.pjs.Player.player.INT+"\n"+
		"SAB: " + gestorAplicacion.pjs.Player.player.SAB+"\n"+
		"CAR: " + gestorAplicacion.pjs.Player.player.CAR+"\n"+
		"Arma equipada: " + Player.arma.nombre+"\n"+
		"Escudo equipado: " + Player.armadura.nombre+"\n"+
		"Descripción: " + gestorAplicacion.pjs.Player.player.descripcion+"\n"
		);
	}
	
	public static void comandoExit() {
		System.out.println("�Hasta pronto!");
	}

	public static void enterCombate(String enemigo){
		System.out.println("Un " + enemigo + " salvaje apareció.\n");
	}

	public static void turnoCombate(){
		
		
		System.out.println("\n¿Qué deseas hacer?\n");
		//String comando = scannerCombate.nextLine();
		
		//scannerCombate.close();
	}

	public static void comandoAttack(){
		System.out.println("Has atacado");
	}

	public static void comandoPotion(){
		System.out.println("Te has tomado una poción");
	}
	
	public static void comandoEscape(){
		System.out.println("Tratas de escapar y..");
	}

	public static void comandoEquivocado(){
		System.out.println("Comando equivocado");
	}

	public static void ataqueFallido(String atacante){
		System.out.println(atacante + " falló su ataque");
	}
	
	public static void escapeExitoso(){
		System.out.println("Logras escapar de la batalla");
	}
	
	public static void escapeFallido(){
		System.out.println("Fallas en tu intento de huir ...miserablemente");
	}

	public static void ataqueRivalExito(int dano, String nombre){
		System.out.println("El " + nombre + " enemigo hizo " + dano + " de daño\nAhora tienes "+ gestorAplicacion.pjs.Player.player.HP + " de vida.");
	}

	public static void victoria(String derrotado, int exp){
		System.out.println("Has derrotado a " + derrotado + " y has obtenido " + exp*200 + " de experiencia");
	}

	public static void derrota(String victorioso){
		System.out.println("Has sido derrotado por " + victorioso);
	}
}
