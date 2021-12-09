package gestorAplicacion.pjs;

public class Enemigo extends NPC{

    public Enemigo(){
        
    }
    public void goblin(){
        this.nombre = "goblin";
        this.HP = 18;
        this.nivel = 1;
        this.dano = 1;
        this.FUE = 12;
		this.DES = 110;
		this.CON = 12;
		this.INT = 12;
		this.SAB = 12;
		this.CAR = 12;
    }

    @Override  // Método abstractos
	public String getNombre() {		
		return this.nombre;
	}

	@Override // Método abstractos
	public int getNivel() {
		return this.nivel;
	}

}
