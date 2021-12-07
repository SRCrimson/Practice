package gestorAplicacion.pjs;

public class NPC {
    public String nombre;
    protected int edad;
    public int nivel; // Hice public nivel
    protected Clase clase;  
    public int HP; // Agregué HP (Hit Points = Puntos de vida)
    public int AC; // Agregué AC (Armor class = clase de armadura)
    public int dano;
    public int FUE, DES, INT, CON, CAR, SAB;     // Cambié de private a public para poderlos usar en Player y Narrador "JM". Cambié VEL por CAR.
    
                                                    //CON = constitucion, define la cantidad de vida del personaje 
                                                    
                                                    //SAB = Sabiduria, define la 
    
    //private Raza raza;                   Quitar comentario cuando se agregue clase Raza
    //private Inventario inventario        Quitar comentario cuandos e agregue clase Inventario
    
    public NPC() { // Agrego contructor sin argumentos para poder crear constructor en Player     
	}
    
    public NPC(String nombre, int edad, Clase clase, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.clase = clase;
        this.nivel= nivel;                                                          //Se crea un NPC de nivel especificado
                     
        
        switch(clase){
            case GUERRERO:
                this.FUE= clase.GUERRERO.getFuerza() + 3 *nivel;                 // clase Guerrero tendrá un aumento mayor para el atributo FUE 
                this.CON = clase.GUERRERO.getConstitucion() + 2*nivel;           //clase Guerrero tendrá un aumento secundario para el atributo consitutcion;
                this.DES = clase.GUERRERO.getDestreza() + 1*nivel;               //para todas las demas caracteristicas tendrá un aumento minimo
                this.INT = clase.GUERRERO.getInteligencia() + 1*nivel;
                this.CAR =clase.GUERRERO.getCarisma()+1*nivel;
                this.SAB=clase.GUERRERO.getSabiduria() +1*nivel;
                clase.aplicarVentajas(clase);
            
            case ARQUERO:
                this.FUE= clase.ARQUERO.getFuerza() + 1 *nivel;                 // clase Arquero tendrá un aumento mayor para el atributo DES 
                this.CON = clase.ARQUERO.getConstitucion() + 1*nivel;           //clase Arquero tendrá un aumento secundario para el atributo VEL;
                this.DES = clase.ARQUERO.getDestreza() + 3*nivel;               //para todas las demas caracteristicas tendrá un aumento minimo
                this.INT = clase.ARQUERO.getInteligencia() + 1*nivel;
                this.CAR=clase.ARQUERO.getCarisma()+2*nivel;
                this.SAB=clase.ARQUERO.getSabiduria() +1*nivel;
                clase.aplicarVentajas(clase);
            
                
            case MAGO:
                this.FUE= clase.MAGO.getFuerza() + 1 *nivel;                 // clase Mago tendrá un aumento mayor para el atributo INT 
                this.CON = clase.MAGO.getConstitucion() + 1*nivel;           //clase Mago tendrá un aumento secundario para el atributo SAB
                this.DES = clase.MAGO.getDestreza() + 1*nivel;               //para todas las demas caracteristicas tendrá un aumento minimo
                this.INT = clase.MAGO.getInteligencia() + 3*nivel;
                this.CAR=clase.MAGO.getCarisma()+1*nivel;
                this.SAB=clase.MAGO.getSabiduria() + 2*nivel;
                clase.aplicarVentajas(clase);
                
        }
        
                
    }
    
   /* public void atacar(Arma arma){
        int danio = arma.danio + (arma.danio* clase.)
    }*/

    public void goblin(){
        this.nombre = "goblin";
        this.HP = 10;
        this.nivel = 1;
        this.dano = 1;
        this.FUE = 12;
		this.DES = 110;
		this.CON = 12;
		this.INT = 12;
		this.SAB = 12;
		this.CAR = 12;
    }


    
    
}
