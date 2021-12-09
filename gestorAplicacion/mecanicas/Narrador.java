package gestorAplicacion.mecanicas; 
import java.util.Scanner;

import gestorAplicacion.Loadout.Armadura;
import gestorAplicacion.pjs.Enemigo;
import uiMain.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import uiMain.*;


public class Narrador {
	
	public static int escenaActual = 0;
	public final static String[] comandos = new String[] {"/help", "/save", "/exit", "/hoja"};
	public final static String[] comandosCombate = new String[] {"/attack", "/option", "/esc"}; // Eliminar
	
	
	public static int intSeleccion;

	static String[] enemies = new String[] {"goblin", "trasgo"};
	
	// Dado de 20 caras
	static int min = 1;  
	static int max = 20;
	
	// Combate
	
	static int probabilidadCombate = 4; // 20%
	static boolean combate = false;  
			
	
	public static void main(String[] args) {						
		uiMain.InterfazUsuario.inicio();
		uiMain.InterfazUsuario.escenario();
		uiMain.InterfazUsuario.narracion();				
	}
	
	public static void setEscena(String seleccion) {
		
		if (seleccion.equals("a")) {
			intSeleccion = 1;
			sets();
		}else if (seleccion.equals("b")){
			intSeleccion = 3;
			sets();
		}else if(Arrays.asList(comandos).contains(seleccion)) {
			comandos(seleccion);
		}else{			
			uiMain.InterfazUsuario.opcionInvalida();
			uiMain.InterfazUsuario.narracion();		
		}
	}
	
	public static void sets() {
		escenaActual = (int) uiMain.InterfazUsuario.allEscenas.get(escenaActual).opciones[intSeleccion]; // Casting (conversi�n de tipos de datos)		
		if (uiMain.InterfazUsuario.allEscenas.get(escenaActual).hayCombate){
			uiMain.InterfazUsuario.enterCombate(uiMain.InterfazUsuario.allEscenas.get(escenaActual).enemigo);
			combate(uiMain.InterfazUsuario.allEscenas.get(escenaActual).enemigo);
		}
		
		uiMain.InterfazUsuario.narracion();
		
	}
	
	public static String getEscena() {
		return uiMain.InterfazUsuario.allEscenas.get(escenaActual).narrativa;
	}
	
	public static Object[] getOpciones() {
		return uiMain.InterfazUsuario.allEscenas.get(escenaActual).opciones;
	}
	
	public int getIdEscena() {
		return escenaActual;
	}

	public static int lanzarDados() {
		int resultadoDados = (int)(Math.random()*(max-min+1)+min);		
		return resultadoDados;
	}
	
	public static void comandos(String comando) {
		if (comando.equals("/help")) {
			uiMain.InterfazUsuario.comandoHelp();
			if (!uiMain.InterfazUsuario.allEscenas.get(escenaActual).hayCombate){
				uiMain.InterfazUsuario.narracion();			
			}
		}else if(comando.equals("/exit")) {
			uiMain.InterfazUsuario.comandoExit();
			System.exit(0);
		}else if(comando.equals("/hoja")){
			uiMain.InterfazUsuario.hojaPJ();
			if (!uiMain.InterfazUsuario.allEscenas.get(escenaActual).hayCombate){
				uiMain.InterfazUsuario.narracion();			
			}
		}else if(comando.equals("/save")) {
			// GUARDAR PARTIDA
		}else{
			uiMain.InterfazUsuario.comandoEquivocado();
			if (!uiMain.InterfazUsuario.allEscenas.get(escenaActual).hayCombate){
				uiMain.InterfazUsuario.narracion();
			}
		}			
	}
	
	public static void combate(String enemigo) {
		
		//gestorAplicacion.pjs.NPC enemy = new gestorAplicacion.pjs.NPC();
		gestorAplicacion.pjs.Enemigo enemy = new gestorAplicacion.pjs.Enemigo();
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
						escenaActual = 0;
						uiMain.InterfazUsuario.inicio();
						uiMain.InterfazUsuario.escenario();
						uiMain.InterfazUsuario.narracion();				
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
