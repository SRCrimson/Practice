package gestorAplicacion.pjs;

public enum Clase {
    
    GUERRERO(5,1, 1, 3, 1, 1), ARQUERO(1,5,1,1,3,1), MAGO(1,1,5,1,1,3);
    private int fuerza, destreza, inteligencia, constitucion, carisma, sabiduria;
    
    private static Double hitBlock=3.5;         //probabilidad de bloquear golpe, es la misma para todas las clases excpeto GUERRERO, que tiene un bono de 20% de probabilidad
    private static Double critHitChance = 3.5;  //Probabilidad de golpe critico, solo cambia en la clase Arquero que tiene un 25%
    
    //LOS DOS ANTERIORES ATRIBUTOS QUEDAN PENDIENTES A REVISION Y APROBACION POR EL GRUPO
    
    private String nombre;
    private String descripcion;

    private Clase(int fuerza, int destreza, int inteligencia, int constitucion, int carisma, int sabiduria) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.constitucion = constitucion;
        this.carisma = carisma;
        this.sabiduria = sabiduria;
    }
        
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public void aplicarVentajas(Clase clase){
        switch (clase){
            case GUERRERO:
                Clase.setHitBlock(4.8);
                
            case ARQUERO:
                Clase.setCritHitChance(5.5);
            
            case MAGO:
                
        }
                
    }
    
    public int getFuerza() {
        return fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getCarisma() {
        return carisma;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public static void setHitBlock(Double hitBlock) {
        Clase.hitBlock = hitBlock;
    }

    public static void setCritHitChance(Double critHitChance) {
        Clase.critHitChance = critHitChance;
    }

    public static Double getHitBlock() {
        return hitBlock;
    }

    public static Double getCritHitChance() {
        return critHitChance;
    }
    
    

    
}


