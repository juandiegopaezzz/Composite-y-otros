package Entradas;

import javax.swing.JOptionPane;

public class JOptionInputMascota implements InputMascota {

    @Override
    public String pedirTipoMascota() {
        return JOptionPane.showInputDialog("Tipo de mascota:");
    }

    @Override
    public String pedirNombreMascota() {
        return JOptionPane.showInputDialog("Nombre de la mascota:");
    }

    @Override
    public String pedriEdadMascota() {
        return JOptionPane.showInputDialog("Edad de la mascota:");
    }
}