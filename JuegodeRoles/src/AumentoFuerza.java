public class AumentoFuerza extends EstadoAlterado {

    private int bonus;

    public AumentoFuerza(int duracion, int bonus) {
        super(duracion);
        this.bonus = bonus;
    }

    @Override
    public void aplicarInicioTurno(Personajes p) {
        reducirDuracion();
    }

    @Override
    public int modificarAtaque(int ataqueBase) {

        System.out.println("Aumento de fuerza: +" + bonus + " al ataque.");

        return ataqueBase + bonus;
    }

    @Override
    public String getNombre() {
        return "Aumento de Fuerza";
    }
}

