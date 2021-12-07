package gestorAplicacion.mecanicas; 
import java.util.Scanner;

import gestorAplicacion.Loadout.Armadura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uiMain.*;


public class Narrador {
	
	public static int escenaActual = 0;
	public static String[] comandos = new String[] {"/help", "/save", "/exit", "/hoja"};
	public static String[] comandosCombate = new String[] {"/attack", "/option", "/esc"}; // Eliminar
	static List<Escena> allEscenas = new ArrayList<Escena>();
	public static int intSeleccion;

	static String[] enemies = new String[] {"goblin", "trasgo"};
	
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
		private boolean hayCombate = false;
		private String enemigo;
		
	}
		
	public static void main(String[] args) {				
		lanzarDados();
		//combate("goblin");
		uiMain.InterfazUsuario.inicio();
		
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
		escena1.opciones = new Object[] {"COMBATE", 4, "op2", 5}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
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
		escenaActual = (int) allEscenas.get(escenaActual).opciones[intSeleccion]; // Casting (conversi�n de tipos de datos)		
		if (allEscenas.get(escenaActual).hayCombate){
			uiMain.InterfazUsuario.enterCombate(allEscenas.get(escenaActual).enemigo);
			combate(allEscenas.get(escenaActual).enemigo);
		}
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
		System.out.println("\nElige una opci�n:\n");
		String seleccion = scanner.nextLine();
		
		setEscena(seleccion);
		scanner.close();
	}*/

	/*public void generarCombateAleatorio() {
		if (lanzarDados() <= probabilidadCombate) {
			combate = true;
		};
		
	}*/
	
	public static int lanzarDados() {
		int resultadoDados = (int)(Math.random()*(max-min+1)+min);		
		return resultadoDados;
	}
	
	public static void comandos(String comando) {
		if (comando.equals("/help")) {
			uiMain.InterfazUsuario.comandoHelp();	
			uiMain.InterfazUsuario.narracion();			
		}else if(comando.equals("/exit")) {
			uiMain.InterfazUsuario.comandoExit();
			System.exit(0);
		}else if(comando.equals("/hoja")){
			uiMain.InterfazUsuario.hojaPJ();
			uiMain.InterfazUsuario.narracion();
			
		}else if(comando.equals("/save")) {
			// GUARDAR PARTIDA
		}else{
			uiMain.InterfazUsuario.comandoEquivocado();
			uiMain.InterfazUsuario.narracion();
		}
			
	}
	
	public static void combate(String enemigo) {
		
		int pjDES = gestorAplicacion.pjs.Player.player.DES;
		gestorAplicacion.pjs.NPC enemy = new gestorAplicacion.pjs.NPC();
		if (enemigo.equals("goblin")){
			enemy.goblin();
		}
		boolean playerTurn = false;

		if (enemy.DES < gestorAplicacion.pjs.Player.player.DES){
			playerTurn = true;
		}
		
		int objetivoPj = 10 + enemy.nivel + gestorAplicacion.pjs.Player.player.AC - Armadura.getDefensa();  // Cuando el objetivo del ataque es el NPC
		int objetivoRival = 10 + gestorAplicacion.pjs.Player.player.nivel + enemy.AC; // Cuando el objetivo del ataque es el PJ
		Scanner scannerCombate = new Scanner(System.in); // Esto no puede llamarse dentro del loop
		while(gestorAplicacion.pjs.Player.player.HP >= 0 && enemy.HP >= 0){
	
			if (playerTurn){ // Si es el turno del jugador
				//prompt jugador
				uiMain.InterfazUsuario.turnoCombate();
				String comando = scannerCombate.nextLine();
				
				if (comando.equals("/atacar")){
					uiMain.InterfazUsuario.comandoAttack();
					if (lanzarDados()<=objetivoRival){ // Si el resultado es exitoso (menor o igual que el objetivo)	
						int dano = gestorAplicacion.Loadout.Arma.getDano();
						System.out.println("Haces " + dano + " de daño al enemigo.");
						enemy.HP -= gestorAplicacion.Loadout.Arma.getDano();

					}else{
						uiMain.InterfazUsuario.ataqueFallido(gestorAplicacion.pjs.Player.player.nombre);
					}
					playerTurn = false;
				}else if(comando.equals("/pocion")){
					// Falta por programar el uso de pociones
					uiMain.InterfazUsuario.comandoPotion();
					playerTurn = false;
				}else if(comando.equals("/hoja")){
					uiMain.InterfazUsuario.hojaPJ();
				
				}else if(comando.equals("/escapar")){ // PROGRAMAR ALGUNOS BICHOS DE LOS CUALES UNO NO SE PUEDA ESCAPAR
					uiMain.InterfazUsuario.comandoEscape();
					if (lanzarDados() <= 6){
						uiMain.InterfazUsuario.escapeExitoso();
						break;
					}else{
						uiMain.InterfazUsuario.escapeFallido();
						playerTurn = false;
					}
					
				}else{
					comandos(comando);
					//uiMain.InterfazUsuario.comandoEquivocado();
				}
				if (enemy.HP < 0){
					uiMain.InterfazUsuario.victoria(enemy.nombre, enemy.nivel);
					darExp(enemy.nivel);
					
				}
				
				
			}else{ // Si es el turno del NPC
				
				if (lanzarDados()<=objetivoPj){ // Si el resultado es exitoso (menor o igual que el objetivo)
					int dano = enemy.dano;
					uiMain.InterfazUsuario.ataqueRivalExito(dano, enemy.nombre);
					gestorAplicacion.pjs.Player.player.HP -= enemy.dano;
					if (gestorAplicacion.pjs.Player.player.HP < 0){
						uiMain.InterfazUsuario.derrota(enemy.nombre);
						break;
					}

				}else{
					uiMain.InterfazUsuario.ataqueFallido(enemy.nombre);
				}
				//System.out.println(gestorAplicacion.pjs.Player.armadura);
				playerTurn = true;
			}
		}

		
		

		
		/* �C�mo se desarrolla un combate? - Bosquejo
		 * Se determinan los involucrados en el combate. Siempre ser� el PJ vs una herencia de NPC.
		 * Se decide qui�n tiene el primer turno seg�n quien tenga un puntaje de destreza mayor entre los contendientes
		 * En el turno del jugador, este podr�: Atacar con arma principal, atacar con hechizos (habilidad especial), usar objeto del inventario.
		 * En el turno del NPC este atacar� y usar� una habilidad especial cada x turnos
		 * - Cuando se ataca se determina si el golpe es exitoso o no de la siguiente manera: objetivo = 10 + nivel del atacante + clase de armadura del atacado - armadura del atacado, luego se lanza 1 dado de 20 caras, 
		 *   si el resultado es menor o igual al n�mero obtenido de la sumatoria anterior, el golpe es exitoso y se procede a determinar el da�o realizado.
		 * - El da�o realizado es igual al da�o del arma
		 * - Luego de calcular el da�o realizado se termina el turno y comienza el del rival
		 * - El combate termina cuando uno de los combatientes obtiene HP menor o igual a 0. 
		 * */
	}

	public static void darExp(int enemyLvl){
		gestorAplicacion.pjs.Player.player.xp += enemyLvl*200;
		int flvl = 0;
		int nextLvlxp = flvl + gestorAplicacion.pjs.Player.player.nivel * 1000;		
		if (gestorAplicacion.pjs.Player.player.xp >= nextLvlxp){
			flvl = nextLvlxp;
			gestorAplicacion.pjs.Player.player.nivel++;
		}
	}

	

}
