package loadout;

public class Armadura {
	private	 String nombre;
	private	 String descripcion;
	private	 int defensa;
	private	 int precio;

public Armadura(String nombre, String descripcion, int defensa, int precio) {
	this.nombre      = nombre;
	this.descripcion = descripcion;
	this.defensa     = defensa;
	this.precio      = precio;
}

public int getDefensa() {
	return defensa;
}

public int CambiarDefensa(int da�o) {   //Implementacion en la clase Player | e.g:   Class Player {
	this.defensa -= da�o;               //                                   			int defensa;  
	return this.defensa;                //                                      		Armadura  "nivel1" = new Armadura(); 
	}                                   //                                     			defensa = "nivel1".getDefensa();
                                        //                                      		defensa = "nivel1".CambiarDefensa("da�o"); } 
}										//Ideally this would be called in the method "combate"