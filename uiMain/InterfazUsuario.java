package uiMain;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.pjs.Player;



public class InterfazUsuario {
	public static List<Escena> allEscenas = new ArrayList<Escena>();
	public static class Escena{
		public int idEscena;
		public String narrativa;
		public Object[] opciones;
		public boolean hayCombate = false;
		public String enemigo;
		
	}
	
	public static void inicio() {
	
	System.out.println("   ___|         |         |                                                   |              \\  |               |            \r\n"
			+ "  |       _` |  |   _` |  __ \\    _ \\ _  /   _ \\    __|       _ \\  __ \\       |   _` |        \\ |   _` |   __|  __ \\    _ \\  \r\n"
			+ "  |      (   |  |  (   |  |   |  (   |  /   (   | \\__ \\       __/  |   |      |  (   |      |\\  |  (   |  (     | | |  (   | \r\n"
			+ " \\____| \\__,_| _| \\__,_| _.__/  \\___/ ___| \\___/  ____/     \\___| _|  _|     _| \\__,_|     _| \\_| \\__,_| \\___| _| |_| \\___/\n");
	}

	public static void escenario(){

		
		
		Escena escena0 = new Escena();
		escena0.hayCombate = false;
		escena0.idEscena = 0;
		escena0.narrativa = "Narrativa 0";
		escena0.opciones = new Object[] {"op0", 1, "op10", 3}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena0);
				
		Escena escena1 = new Escena();
		escena1.hayCombate = false;
		escena1.idEscena = 1;
		escena1.narrativa = "Narrativa 1";
		escena1.opciones = new Object[] {"COMBATE", 4, "op2", 5};
		allEscenas.add(escena1);

		
		Escena escena2 = new Escena();
		escena2.hayCombate = false;
		escena2.idEscena = 2;
		escena2.narrativa = "Narrativa 2";
		escena2.opciones = new Object[] {"op12", 5, "op22", 6};
		allEscenas.add(escena2);
		
		Escena escena3 = new Escena();
		escena3.hayCombate = false;
		escena3.idEscena = 3;
		escena3.narrativa = "Narrativa 3";
		escena3.opciones = new Object[] {"op12", 7, "op22", 8};
		allEscenas.add(escena3);

		Escena escena4 = new Escena();
		escena4.hayCombate = true;
		escena4.enemigo = "goblin";
		escena4.idEscena = 4;
		escena4.narrativa = "Narrativa 4";
		escena4.opciones = new Object[] {"op12", 1, "op22", 9};
		allEscenas.add(escena4);

		Escena escena5 = new Escena();
		escena5.hayCombate = false;
		escena5.idEscena = 5;
		escena5.narrativa = "Narrativa 5";
		escena5.opciones = new Object[] {"op1", 1, "op2", 2}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena5);

		
		Escena escena6 = new Escena();
		escena6.hayCombate = false;
		escena6.idEscena = 6;
		escena6.narrativa = "Narrativa 6";
		escena6.opciones = new Object[] {"op12", 3, "op22", 4};
		allEscenas.add(escena6);
		
		Escena escena7 = new Escena();
		escena7.hayCombate = false;
		escena7.idEscena = 7;
		escena7.narrativa = "Narrativa 7";
		escena7.opciones = new Object[] {"op12", 5, "op22", 6};
		allEscenas.add(escena7);

		Escena escena8 = new Escena();
		escena8.hayCombate = false;
		escena8.idEscena = 8;
		escena8.narrativa = "Narrativa 8";
		escena8.opciones = new Object[] {"op12", 7, "op22", 8};
		allEscenas.add(escena8);

		
		Escena escena9 = new Escena();
		escena9.hayCombate = false;
		escena9.idEscena = 9;
		escena9.narrativa = "Narrativa 9";
		escena9.opciones = new Object[] {"op12", 3, "op22", 4};
		allEscenas.add(escena9);
	}

	public static void narracion() {
		//System.out.println(gestorAplicacion.mecanicas.Narrador.allEscenas.get(0).);
		System.out.println(allEscenas.size());
		
		System.out.println("\n" +gestorAplicacion.mecanicas.Narrador.getEscena()+"\n");
		System.out.println("a) "+gestorAplicacion.mecanicas.Narrador.getOpciones()[0]);
		System.out.println("b) "+gestorAplicacion.mecanicas.Narrador.getOpciones()[2]);
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
