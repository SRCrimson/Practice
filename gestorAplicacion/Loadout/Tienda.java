package gestorAplicacion.Loadout;

public class Tienda {
/* Para las opciones "a", "b" y "c" corresponderia el nombre de las armas1, 2 y 3 respectivamente. 
 * Asi el jugador no tiene que ingrear el nombre del arma como tal
 */
public static void ComprarArmaGuerrero(String nombre, int wallet) {

// Creamos 3 objetos de clase Arma	Guerrero
	
	Arma espada1 = new Arma("Bisturi",   "De poco filo", 1, 100);       
	Arma espada2 = new Arma("Excalibur", "Espada legendaria", 2, 200);
	Arma espada3 = new Arma("Ragnarok",  "World ender", 5, 500);        

	if        (nombre == "a" && wallet >= espada1.precio) {
		Inventario.listaArmas.add(espada1);                    //ListArray para añadirlo al inventario
	} else if (nombre == "b" && wallet >= espada2.precio) {
		Inventario.listaArmas.add(espada2);					   //ListArray para añadirlo al inventario
	} else if (nombre == "c" && wallet >= espada3.precio) { 
		Inventario.listaArmas.add(espada3);                    //ListArray para añadirlo al inventario
	}
	else {
		System.out.println("No hay lukas pa espadas pa");
		}	
	}

public static void ComprarArmaArquero(String nombre, int wallet) {

// Creamos 3 objetos de clase Arma Para Arquero
	
	Arma arco1 = new Arma("Arco de Madera",   "Para alguien habil no resultara dificil usarlo", 1, 100);       
	Arma arco2 = new Arma("Arco Compuesto",   "Destaca por su precision y dureza", 2, 200);
	Arma arco3 = new Arma("Azkar",  		  "Solo es posible usarlo en manos del el mas habil arquero", 5, 500);        

	if        (nombre == "a" && wallet >= arco1.precio) {   
		Inventario.listaArmas.add(arco1);					  //ListArray para añadirlo al inventario	
	} else if (nombre == "b" && wallet >= arco2.precio) {
		Inventario.listaArmas.add(arco2);					  //ListArray para añadirlo al inventario
	} else if (nombre == "c" && wallet >= arco3.precio) {
		Inventario.listaArmas.add(arco3); 			         //ListArray para añadirlo al inventario
	}
	else {
		System.out.println("No hay lukas pa arcos pa");
		}	
	}

public static void ComprarArmaMago(String nombre, int wallet) {

	// Creamos 3 objetos de clase Arma para Mago
		
		Arma baston1 = new Arma("Baston de runas",   "Arma preferida por jovenes aprendices", 1, 100);       
		Arma baston2 = new Arma("Baston astral ",    "Pocos han podido emplearlo a su maximo potencial", 2, 200);
		Arma baston3 = new Arma("Omnirod",           "Pasado de generacion en generacion, con poderes ocultos latentes", 5, 500);        

		if        (nombre == "a" && wallet >= baston1.precio) {
			Inventario.listaArmas.add(baston1);					//ListArray para añadirlo al inventario
		} else if (nombre == "b" && wallet >= baston2.precio) {
			Inventario.listaArmas.add(baston2);					//ListArray para añadirlo al inventario
		} else if (nombre == "c" && wallet >= baston3.precio) {
			Inventario.listaArmas.add(baston3); 				//ListArray para añadirlo al inventario
		}
		else {
			System.out.println("No hay lukas pa staffs pa");
		}	
	}
	
public static void ComprarArmadura(String nombre, int wallet) {
	
		Armadura bronzeArmor = new Armadura("Armadura de bronce", "De poco costo y dureza respetable", 1, 100); 
		Armadura silverArmor = new Armadura("Armadura de plata",  "Otorgada a distinguidos heroes por sus hazañas", 2, 200);
		Armadura goldArmor   = new Armadura("Armadura de Oro",    "Solo puede ser forjada una vez cada 100 años", 3, 300);

		if        (nombre == "a" && wallet >= bronzeArmor.precio) {
			Inventario.listaArmaduras.add(bronzeArmor);
		} else if (nombre == "b" && wallet >= silverArmor.precio) {
			Inventario.listaArmaduras.add(silverArmor);
		} else if (nombre == "c" && wallet >= goldArmor.precio) {
			Inventario.listaArmaduras.add(goldArmor); 
		}
		else {
			System.out.println("No hay lukas pa armaduras pa");
		}
	}
  	
public static void ComprarPocion(String nombre, int wallet) {

	Pocion pocion_S = new Pocion("Pocion Small",  "Otorga 10 de vida al jugador", 20, 100);
	Pocion pocion_M = new Pocion("Pocion Medium", "Otorga 25 de vida al jugador", 25, 200);
	Pocion pocion_L = new Pocion("Pocion Large",  "Otorga la mitad de la vida al jugador", 50, 300);

	if (nombre == "pocion S" && wallet >= pocion_S.precio) {           
		Inventario.listaPociones.add(pocion_S);
	} else if (nombre == "Pocion M" && wallet >= pocion_M.precio){
		Inventario.listaPociones.add(pocion_M);
	} else if (nombre == "Pocion L" && wallet >= pocion_L.precio) {
		Inventario.listaPociones.add(pocion_L); 
	}
	else {
		System.out.println("No hay lukas pa pociones pa");
	}
	}
}


/*
 * Falta hacer las implementaciones para player:
 * 1) Cambiar arma, armadura, utilizar pocion
 * 2) limitar las opciones de la tienda dependiendo de la clasee. e.g: si es guerrero solo podra comprar espadas
 * 3) Para la pocion L, que la curacion sea del 50% de la vida del jugador
 */


