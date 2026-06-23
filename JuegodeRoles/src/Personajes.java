
import java.util.ArrayList;
import java.util.List;

public abstract class Personajes {

    protected String nombre;
    protected int vida, ataque, nivel;
    protected List<Objeto> inventario;
    protected Objeto equipado;
    protected List<EstadoAlterado> estados;

    public Personajes(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.nivel = 1;
        this.inventario = new ArrayList<>();
        this.equipado = null;
        this.estados = new ArrayList<>();
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

    public void agregarObjeto(Objeto objeto) {
        inventario.add(objeto);
    }

    public boolean equiparObjeto(Objeto objeto) {
        if (inventario.contains(objeto)) {
            equipado = objeto;
            return true;
        }
        return false;
    }

    public boolean equiparObjeto(String nombreObjeto) {
        for (Objeto objeto : inventario) {
            if (objeto.getNombre().equalsIgnoreCase(nombreObjeto)) {
                equipado = objeto;
                return true;
            }
        }
        return false;
    }

    public void desequipar() {
        equipado = null;
    }

    public Objeto getObjetoEquipado() {
        return equipado;
    }

    public int getBonusAtaqueEquipado() {
        return equipado != null ? equipado.getBonusAtaque() : 0;
    }

    public int getBonusDefensaEquipado() {
        return equipado != null ? equipado.getBonusDefensa() : 0;
    }

    public abstract int atacar();

    public abstract int defender();

    public void agregarEstado(EstadoAlterado estado) {
        this.estados.add(estado);
        System.out.println(this.nombre + " ahora tiene el estado: " + estado.getNombre());
    }

    public void procesarEstadosInicioTurno() {
        if (estados.isEmpty()) {
            return;
        }
        List<EstadoAlterado> copia = new ArrayList<>(estados);
        for (EstadoAlterado est : copia) {
            est.aplicarInicioTurno(this);
            est.decrementarDuracion();
            if (!est.estaActivo()) {
                estados.remove(est);
                System.out.println(this.nombre + " deja de tener el estado: " + est.getNombre());
            }
        }
    }

    public boolean puedeAtacar() {
        for (EstadoAlterado est : estados) {
            if (!est.permiteAtacar()) {
                return false;
            }
        }
        return true;
    }

    // Devuelve el ataque final después de aplicar modificadores de estados
    public int obtenerAtaqueFinal() {
        int base = this.atacar();
        int mod = base;
        for (EstadoAlterado est : estados) {
            mod = est.modificarAtaque(mod);
        }
        return mod;
    }
}
