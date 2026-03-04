package composite;

import model.Mascota;

public class MascotaLeaf implements MascotaComponent {
    private Mascota mascota;

    public MascotaLeaf(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void mostrar() {
        System.out.println(
            mascota.getTipo() + " - " +
            mascota.getNombre() + " - " +
            mascota.getEdad()
        );
    }
}