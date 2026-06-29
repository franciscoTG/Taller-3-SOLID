public class Envenenado extends EstadoAlterado {

    private int danoPorTurno;

    public Envenenado(int duracion, int danoPorTurno) {
        super(duracion);
        this.danoPorTurno = danoPorTurno;
    }

    @Override
    public void aplicarInicioTurno(Personajes p) {

        p.recibirDanio(danoPorTurno);

        System.out.println(p.getNombre()
                + " recibe "
                + danoPorTurno
                + " de daño por envenenamiento.");

        reducirDuracion();
    }

    @Override
    public String getNombre() {
        return "Envenenado";
    }
}
