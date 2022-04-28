public class Pokemon extends Personaje{

    //tipo - String
    //habilidad - Habilidad
    //HP - int
    //esLegendario - boolean
    //debilContra - String
    //fuerte contra - String
    //ataue - int

    private String tipo;
    private Habilidad habilidad;
    private int hp;
    private  boolean esLegendario;
    private String fuerteContra;
    private int ataque;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getFuerteContra() {
        return fuerteContra;
    }

    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Pokemon(String nombre, int nivel, char genero,
                   String tipo, Habilidad habilidad, int hp, boolean esLegendario,
                   String fuerteContra, int ataque) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.fuerteContra = fuerteContra;
        this.ataque = ataque;
    }

    //pelea
    // consumi pocion o baya  para ataque?
        //habilidad.ataqueBase + 20

        //si mi pokemon es fuerte contra el pokemon opuesto
            //+ ataque de habilidad
        //sino si mi pokemon es debil contra el pokemon opuesto
            //- ataque de habilidad
        //sino
            //normal ataque

        //cuando se lanza el ataque se resta la vida
        // de ataque del hp
}
