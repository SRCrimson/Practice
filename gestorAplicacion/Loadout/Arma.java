package gestorAplicacion.Loadout;

public class Arma {
	public String nombre;
	//private	String descripcion;
	public static int dano;
	//private	int precio;

/*public Arma(){

}*/
	public Arma(String nombre, String descripcion, int dano, int precio) { // Agregué nombre del arma
		this.nombre = nombre;
		//this.descripcion = descripcion;
		Arma.dano = dano;
		//this.precio = precio;
	}

	public static int getDano() {  //Class Player{
		return dano;		//	int fuerza;
	}						//	Arma arma1 = new Arma();
							//	fuerza += arma1.getda�o
}

