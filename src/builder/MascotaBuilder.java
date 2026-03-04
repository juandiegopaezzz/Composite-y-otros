package builder;

import model.Mascota;

public interface MascotaBuilder {
    void buildTipo(String tipo);
    void buildNombre(String nombre);
    void buildEdad(double edad);
    Mascota getMascota();
}