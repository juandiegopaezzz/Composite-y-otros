package builder;

import model.Mascota;

public class MascotaConcretaBuilder implements MascotaBuilder {
    private Mascota mascota = new Mascota();

    public void buildTipo(String tipo) {
        mascota.setTipo(tipo);
    }

    public void buildNombre(String nombre) {
        mascota.setNombre(nombre);
    }

    public void buildEdad(double edad) {
        mascota.setEdad(edad);
    }

    public Mascota getMascota() {
        return mascota;
    }
}