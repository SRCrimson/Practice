package loadout;

public class Arma {
private	String descripcion;
private	int da�o;
private	int precio;

public Arma(String descripcion, int da�o, int precio) {
	this.descripcion = descripcion;
	this.da�o = da�o;
	this.precio = precio;
}

public int getDa�o() {  //Class Player{
	return da�o;		//	int fuerza;
}						//	Arma arma1 = new Arma();
						//	fuerza += arma1.getda�o

}

