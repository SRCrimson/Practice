package gestorAplicacion.pjs;

//import gestorAplicacion.Loadout.Arma;

public class Player extends gestorAplicacion.pjs.NPC { //player debe ser hija de NPC
	//private int id;  //creo que el id es mejor si es un numero 
	//protected String email; // ¿Para qué email?
	public int xp;
	//public int movimientoBase; // No es necesario
	public int HP;
	public String descripcion;
	public static  gestorAplicacion.Loadout.Armadura armadura;
	public static gestorAplicacion.Loadout.Arma arma;
	public Player(String Default) { // Jugador por defecto
		this.nombre = "Freud Baggins";
		this.HP = 12;
		this.AC = 6;
		this.nivel = 1;
		this.xp = 0;
		this.clase = gestorAplicacion.pjs.Clase.GUERRERO;
		this.edad = 50;
		this.FUE = 12;
		this.DES = 12;
		this.CON = 12;
		this.INT = 12;		
		this.SAB = 12;
		this.CAR = 12;
		Player.armadura = new gestorAplicacion.Loadout.Armadura("Escudo de cuero", "Escudo pequeño hecho de cuero", 3, 300);
		Player.arma = new gestorAplicacion.Loadout.Arma("Espada corta", "Pequeña espada corta forjada por herreros locales",4,1);
		this.descripcion = "Humano del Este adiestrado en el arte de la guerra.";
	}

	public void SubirNivel() {
		this.nivel++;
	}
	public void cambiarArmadura() {
		
	}
	public void cambiarArma() {
		
	}

	

	public static Player player = new Player("asda");
	/*public void moverse() { // NO ES NECESARIO
		
	}*/
	@Override
	public String getNombre() {		
		return this.nombre;
	}

	@Override
	public int getNivel() {
		return this.nivel;
	}

}