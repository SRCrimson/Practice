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
		escena0.narrativa = ""+
		"\nLa zozobra se había instalado en los habitantes del lejano poblado de Campoverde. Atrás habían quedado los días donde los párvulos retoños de Campoverde\n"+
		"jugaban a las escondidillas en los frondosos bosques limítrofes. Una invisible amenaza se arrastraba por la región, las desapariciones y asesinatos cada\n"+
		"vez eran más frecuentes y el alcalde Dientemayor había reunido cuadrillas de exploración para contrarrestar la amenaza oculta tras las sombras.\n\n"+
		"Has decidido no quedarte de brazos cruzados, pues al no haber cumplido aún la mayoría de edad, los adultos del lugar decidieron que no podrías ser parte\n"+
		"de la delegación. Has tomado prestada la espada corta y el pequeño escudo de tu abuelo Timun Haldegarth, el otrora gran guerrero del reino de Erzia.\n\n"+
		"Has esperado el anochecer para ir más allá de la amurallada aldea y ahora un cielo estrellado ilumina tenuemente tu trayecto hacia los bosques de Campoverde.\n"+ 
		"Conoces cada rincón del bosque, pues han sido incontables las idas y venidas a través de él, te es fácil reconocer un casi desapercibido camino que se proyecta\n"+
		"a un costado del camino principal, lo recorres hasta llegar al pie de una colina. Un montón de piedras se apilan en frente tuyo.\n";
		escena0.opciones = new Object[] {"Echar un vistazo al cúmulo de piedras", 1, "Rodear la colina", 2}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena0);
				
		Escena escena1 = new Escena();
		escena1.hayCombate = false;
		escena1.idEscena = 1;
		escena1.narrativa = "El cúmulo de rocas no parece ser una formación natural. Un olor a sopa nauseabunda y leños quemándose parece proceder de alguna caverna oculta tras\n"+
		"las piedras.";
		escena1.opciones = new Object[] {"Echar un vistazo a través de los agujeros entre las rocas", 3, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena1);

		
		Escena escena2 = new Escena();
		escena2.hayCombate = true;
		escena2.enemigo = "goblin";
		escena2.idEscena = 2;
		escena2.narrativa = "Luego de luchar contra aquella alimaña, retornas al cúmulo de piedras y decides que es mejor echar un vistazo, seguramente ese goblin tiene relación\n"+
		"con aquella misteriosa pila.\n\n El cúmulo de rocas no parece ser una formación natural. Un olor a sopa nauseabunda y leños quemándose parece proceder de alguna\n"+
		"caverna oculta tras las piedras.";
		escena2.opciones = new Object[] {"Echar un vistazo a través de los agujeros entre las rocas", 3, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena2);
		
		Escena escena3 = new Escena();
		escena3.hayCombate = false;
		escena3.idEscena = 3;
		escena3.narrativa = "Ves a un goblin haciendo guardia, aunque parece estar próximo a quedarse dormido el diligente esbirro. En ese preciso momento llega\n"+
		"un segundo guardia, mucho más fornido que el anterior y en aparente estado de embriaguez, tienta al atento guardia para abandonar su puesto de trabajo\n"+
		"para tomarse un par de hidromieles salvajes, pues al fin y al cabo: ¿quién podría descifrar el acertijo mágico que protege aquella entrada?\n"
		+"Ambas criaturas desaparecen -junto con su olor- quedando la entrada libre.";
		escena3.opciones = new Object[] {"Buscar en las rocas algo relacionado con aquel acertijo", 5, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena3);

		Escena escena4 = new Escena();
		escena4.hayCombate = true;
		escena4.enemigo = "goblin";
		escena4.idEscena = 4;
		escena4.narrativa = "Después de la ingeniosa decisión, la entrada a la caverna ha quedado despejada,\n"+
		"siendo esta iluminada solo por la pálida luna.";
		escena4.opciones = new Object[] {"Adentrarse en la caverna", 6, "Es muy peligroso seguir adelante yo solo. Volveré al pueblo y le contaré a los adultos.", 6};
		allEscenas.add(escena4);

		Escena escena5 = new Escena();
		escena5.hayCombate = false;
		escena5.idEscena = 5;
		escena5.narrativa = "Lo que a primera vista pasa desapercibido, ante tu mirada atenta se deja ver una inscripción en el lenguaje de los elfos,\n"+
		"que reconoces fácilmente, pues Windalf, el viego mago, te instruyó en esta bella lengua años atrás.";
		escena5.opciones = new Object[] {"Descifrar el acertijo", 7, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena5);


		Escena escena6 = new Escena();
		escena6.hayCombate = false;
		escena6.idEscena = 6;
		escena6.narrativa = "Hasta acá la demo.";
		escena6.opciones = new Object[] {"Jugar de nuevo", 0, "salir", 0};
		allEscenas.add(escena6);
		
		Escena escena7 = new Escena();
		escena7.hayCombate = false;
		escena7.idEscena = 7;
		escena7.narrativa = "Con mucho orgullo pero poca sabiduría, malogras el hechizo y derribas las piedras que cubren la entrada a la caverna,\n"+
		"alertando así los guardas, iniciándose un combate feroz bajo la mortecina luz de la luna.";
		escena7.opciones = new Object[] {"Adentrarse en la caverna", 6, "Es muy peligroso seguir adelante yo solo. Volveré al pueblo y le contaré a los adultos.", 6};
		allEscenas.add(escena7);
		
	}

	public static void narracion() {
		//System.out.println(gestorAplicacion.mecanicas.Narrador.allEscenas.get(0).);
		//System.out.println(allEscenas.size());
		
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
