   public abstract class EstadoAlterado {

    protected int duracion;

    public EstadoAlterado(int duracion) {
        this.duracion = duracion;
    }

    // Se ejecuta al inicio del turno
    public abstract void aplicarInicioTurno(Personajes personaje);

    // Indica si el personaje puede atacar
    public boolean permiteAtacar() {
        return true;
    }

    // Modifica el ataque si es necesario
    public int modificarAtaque(int ataqueBase) {
        return ataqueBase;
    }

    // Reduce la duración
    public void reducirDuracion() {
        duracion--;
    }

    // Verifica si terminó
    public boolean expiro() {
    return this.duracion <= 0;
}

    public abstract String getNombre();
}
