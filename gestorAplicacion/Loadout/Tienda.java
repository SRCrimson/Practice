package gestorAplicacion.Loadout;
import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
	
public static List<Arma>     listaArmasGuerreroTienda  = new ArrayList<Arma>();
public static void AñadirGuerrero() {
	listaArmasGuerreroTienda.add(new Arma("Bisturi",   "De poco filo", 1, 100));
	listaArmasGuerreroTienda.add(new Arma("Excalibur", "Espada legendaria", 2, 200));
	listaArmasGuerreroTienda.add(new Arma("Ragnarok",  "World ender", 5, 500));
}

public static List<Arma>     listaArmasArqueroTienda   = new ArrayList<Arma>();
public static void AñadirArquero() {
	listaArmasArqueroTienda.add(new Arma("Arco de Madera",   "Para alguien habil no resultara dificil usarlo", 1, 100));       
	listaArmasArqueroTienda.add(new Arma("Arco Compuesto",   "Destaca por su precision y dureza", 2, 200));
	listaArmasArqueroTienda.add(new Arma("Azkar",  		     "Solo es posible usarlo en manos del el mas habil arquero", 5, 500));
}

public static List<Arma>     listaArmasMagoTienda      = new ArrayList<Arma>();
public static void AñadirMago() {
	listaArmasMagoTienda.add(new Arma("Baston de runas",   "Arma preferida por jovenes aprendices", 1, 100));       
	listaArmasMagoTienda.add(new Arma("Baston astral ",    "Pocos han podido emplearlo a su maximo potencial", 2, 200));
	listaArmasMagoTienda.add(new Arma("Omnirod",           "Pasado de generacion en generacion, con poderes ocultos latentes", 5, 500));
}

public static List<Armadura> listaArmadurasTienda      = new ArrayList<Armadura>();
public static void AñadirArmaduras() {
	listaArmadurasTienda.add(new Armadura("Armadura de bronce", "De poco costo y dureza respetable", 1, 100));
	listaArmadurasTienda.add(new Armadura("Armadura de plata",  "Otorgada a distinguidos heroes por sus haza�as", 2, 200));
	listaArmadurasTienda.add(new Armadura("Armadura de Oro",    "Solo puede ser forjada una vez cada 100 a�os", 3, 300));
}

public static List<Pocion>   listaPocionesTienda         = new ArrayList<Pocion>();
public static void AñadirPociones() {
	listaPocionesTienda.add(new Pocion("Pocion Small",  "Otorga 10 de vida al jugador", 20, 100));
	listaPocionesTienda.add(new Pocion("Pocion Medium", "Otorga 25 de vida al jugador", 25, 200));
	listaPocionesTienda.add(new Pocion("Pocion Large",  "Otorga la mitad de la vida al jugador", 50, 300));
}

public static void ComprarArmaGuerrero(char nombre, int wallet) {
	
	if        (nombre == '1' && wallet >= listaArmasGuerreroTienda.get(0).precio) {
		Inventario.listaArmasGuerrero.add(listaArmasGuerreroTienda.get(0));          
		System.out.println("Compra de arma exitosa!");
	} else if (nombre == '2' && wallet >= listaArmasGuerreroTienda.get(1).precio) {
		Inventario.listaArmasGuerrero.add(listaArmasGuerreroTienda.get(1));		      
		System.out.println("Compra de arma exitosa!");
	} else if (nombre == '3' && wallet >= listaArmasGuerreroTienda.get(2).precio) { 
		Inventario.listaArmasGuerrero.add(listaArmasGuerreroTienda.get(2));           
		System.out.println("Compra de arma exitosa!");
	}
	else {
		System.out.println("Dinero insuficiente para espadas");
		}	
	}

public static void ComprarArmaArquero(char nombre, int wallet) {     

	if        (nombre == '1' && wallet >=  listaArmasArqueroTienda.get(0).precio) {   
		Inventario.listaArmasArquero.add(listaArmasArqueroTienda.get(0));
		System.out.println("Compra de arma exitosa!");
	} else if (nombre == '2' && wallet >=  listaArmasArqueroTienda.get(1).precio) {
		Inventario.listaArmasArquero.add(listaArmasArqueroTienda.get(1));
		System.out.println("Compra de arma exitosa!");
	} else if (nombre == '3' && wallet >=  listaArmasArqueroTienda.get(2).precio) {
		Inventario.listaArmasArquero.add(listaArmasArqueroTienda.get(2));
		System.out.println("Compra de arma exitosa!");
	}
	else {
		System.out.println("Dinero insuficiente para Arcos");
		}	
	}

public static void ComprarArmaMago(char nombre, int wallet) {      

	if        (nombre == '1' && wallet >=  listaArmasMagoTienda.get(0).precio) {
		Inventario.listaArmasMago.add(listaArmasMagoTienda.get(0));
		System.out.println("Compra de arma exitosa!");
	} else if (nombre == '2' && wallet >=  listaArmasMagoTienda.get(1).precio) {
		Inventario.listaArmasMago.add(listaArmasMagoTienda.get(1));
		System.out.println("Compra de arma exitosa!");
	} else if (nombre == '3' && wallet >=  listaArmasMagoTienda.get(2).precio){
		Inventario.listaArmasMago.add(listaArmasMagoTienda.get(2));
		System.out.println("Compra de arma exitosa!");
	}
	else {
		System.out.println("Dinero insuficiente para bastones");
	}	
}
	
public static void ComprarArmadura(char nombre, int wallet) {

	if        (nombre == '1' && wallet >= listaArmadurasTienda.get(0).precio) {
		Inventario.listaArmaduras.add(listaArmadurasTienda.get(0));
		System.out.println("Compra de armadura exitosa!");
	} else if (nombre == '2' && wallet >= listaArmadurasTienda.get(1).precio) {
		Inventario.listaArmaduras.add(listaArmadurasTienda.get(1));
		System.out.println("Compra de armadura exitosa!");
	} else if (nombre == '3' && wallet >= listaArmadurasTienda.get(2).precio) {
		Inventario.listaArmaduras.add(listaArmadurasTienda.get(2)); 
		System.out.println("Compra de armadura exitosa!");
	}
	else {
		System.out.println("Dinero insuficiente para armaduras");
	}
}
  	
public static void ComprarPocion(char nombre, int wallet) {

	if (nombre == '1' && wallet >= listaPocionesTienda.get(0).precio) {           
		Inventario.listaPociones.add(listaPocionesTienda.get(0));
		System.out.println("Compra de pocion exitosa!");
	} else if (nombre == '2' && wallet >= listaPocionesTienda.get(1).precio){
		Inventario.listaPociones.add(listaPocionesTienda.get(1));
		System.out.println("Compra de pocion exitosa!");
	} else if (nombre == '3' && wallet >= listaPocionesTienda.get(2).precio) {
		Inventario.listaPociones.add(listaPocionesTienda.get(2)); 
		System.out.println("Compra de pocion exitosa!");
	}
	else {
		System.out.println("Dinero insuficiente para pociones");
	}
	}
}