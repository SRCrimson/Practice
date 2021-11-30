package Paquete1;

public class Player extends NPC { //plyer debe ser hija de NPC
	private int id;  //creo que el id es mejor si es un numero
	protected String email;
	public int xp;
	public int movimientoBase;
	public Player(int id,String email,int xp,int movimientoBase) {
		this.id=id;
		this.email=email;
		this.xp=xp;
		this.movimientoBase=movimientoBase;
	}
	public void SubirNivel() {
		NPC.nivel++;
	}
	public void cambiarArmadura() {
		
	}
	public void cambiarArma() {
		
	}
	public void moverse() {
		
	}

}
