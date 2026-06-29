
public class Congelado extends EstadoAlterado {

    public Congelado(int duracion) {
        super(duracion);
    }

    @Override
    public void aplicarInicioTurno(Personajes p) {

        System.out.println(p.getNombre()
                + " está congelado y no puede atacar este turno.");

        reducirDuracion();
    }

    @Override
    public boolean permiteAtacar() {
        return false;
    }

    @Override
    public String getNombre() {
        return "Congelado";
    }
}
