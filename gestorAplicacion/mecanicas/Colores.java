package gestorAplicacion.mecanicas;

public enum Colores {

        BLANCO("\033[0;37m"),
        AZUL("\033[0;34m"),
        //ROJO("\033[0;31m"),
        ROJO("\033[31m"),
        VERDE("\033[0;32m"),
        AMARILLO("\033[0;33m"),   
        BLANCO_UNDERLINED("\033[4;37m"),
        BLUE_UNDERLINED("\033[4;34m"),
        ROJO_UNDERLINED("\033[4;31m"),
        VERDE_BACKGROUND("\033[42m"), 
        BLANCO_BOLD("\033[1;37m"),
        RESET("\033[0m");
        
        public final String code;

        Colores(String code) {
            this.code = code;
        }
    
        @Override
        public String toString() {
            return code;
        }


}