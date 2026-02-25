package Salidas;

import javax.swing.JOptionPane;

public class JOptionOutputMascota implements OutputMascota {

    @Override
    public void mostrarMascota(String tipo, String nombre, double edad) {
        JOptionPane.showMessageDialog(null,
            "Mascota: " + tipo + "\nNombre: " + nombre + "\nEdad: " +edad );
    }
}