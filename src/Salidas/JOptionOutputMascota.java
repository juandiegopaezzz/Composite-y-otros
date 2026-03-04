package Salidas;

import javax.swing.JOptionPane;
import model.Mascota;

public class JOptionOutputMascota implements OutputMascota {

    @Override
    public void mostrarMascota(Mascota mascota) {
        JOptionPane.showMessageDialog(null,
            "Tipo: " + mascota.getTipo() +
            "\nNombre: " + mascota.getNombre() +
            "\nEdad: " + mascota.getEdad()
        );
    }
}