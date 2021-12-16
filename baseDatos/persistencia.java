package baseDatos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import gestorAplicacion.Loadout.Inventario;

public class persistencia {
    static String fichero = System.getProperty("user.dir");

    public static void escribirFichero(){
        try{
            
            ObjectOutputStream jugador = new ObjectOutputStream(new FileOutputStream(fichero+"\\baseDatos\\temp\\pj.dat"));
            jugador.writeObject(gestorAplicacion.pjs.Player.player);
            jugador.close();            
            
            ObjectOutputStream escenaActualSaved = new ObjectOutputStream(new FileOutputStream(fichero+"\\baseDatos\\temp\\scene.dat"));
            escenaActualSaved.writeObject(gestorAplicacion.mecanicas.Narrador.escenaActual);
            escenaActualSaved.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void leerFichero(){
        try{
            ObjectInputStream dataPj = new ObjectInputStream(new FileInputStream(fichero+"\\baseDatos\\temp\\pj.dat"));
            gestorAplicacion.pjs.Player playerData = (gestorAplicacion.pjs.Player) dataPj.readObject();            

            ObjectInputStream dataEsc = new ObjectInputStream(new FileInputStream(fichero+"\\baseDatos\\temp\\scene.dat"));
            int escenaActualSavedData = (int) dataEsc.readObject();

            gestorAplicacion.mecanicas.Narrador.escenaActual = escenaActualSavedData;
            
            dataPj.close();
            
            dataEsc.close();

        }catch(Exception e){
            System.out.println("No hay una partida guardada - se iniciará una partida nueva");
            //e.printStackTrace();
        }
    }
}

