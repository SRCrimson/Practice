package gestorAplicacion.Loadout;

public class Armadura {
	public	 String nombre;
	private	 String descripcion;
	private	 static int defensa; // Lo hice static
	private	 int precio;

public Armadura(String nombre, String descripcion, int defensa, int precio) {
	this.nombre      = nombre;
	this.descripcion = descripcion;
	this.defensa     = defensa;
	this.precio      = precio;
}

public static int getDefensa() { // Lo hice static
	return defensa;
}

public int CambiarDefensa(int dano) {   //Implementacion en la clase Player | e.g:   Class Player {
	this.defensa -= dano;               //                                   			int defensa;  
	return this.defensa;                //                                      		Armadura  "nivel1" = new Armadura(); 
	}                                   //                                     			defensa = "nivel1".getDefensa();
                                        //                                      		defensa = "nivel1".CambiarDefensa("da�o"); } 
}										//Ideally this would be called in the method "combate"