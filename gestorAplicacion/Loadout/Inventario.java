package gestorAplicacion.Loadout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventario implements Serializable{
	
	public static List<Arma>     listaArmas      = new ArrayList<Arma>();

	public static List<Armadura> listaArmaduras  = new ArrayList<Armadura>();
	
	public static List<Pocion>   listaPociones   = new ArrayList<Pocion>();
		
}
