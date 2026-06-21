package juegoderoles;

public abstract class Personajes {

    protected String nombre;
    protected int vida, ataque, nivel;

    public Personajes(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.nivel = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void recibirDanio(int cantidad) {
        this.vida -= cantidad;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public abstract int atacar();

    public abstract int defender();
}
