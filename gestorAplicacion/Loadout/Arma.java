package loadout;

public class Arma {
private	String descripcion;
private	int daño;
private	int precio;

public Arma(String descripcion, int daño, int precio) {
	this.descripcion = descripcion;
	this.daño = daño;
	this.precio = precio;
}

public int getDaño() {  //Class Player{
	return daño;		//	int fuerza;
}						//	Arma arma1 = new Arma();
						//	fuerza += arma1.getdaño

}

