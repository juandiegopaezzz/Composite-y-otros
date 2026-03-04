package Salidas;

import model.Mascota;

public class WebOutputMascota implements OutputMascota {

    @Override
    public void mostrarMascota(Mascota mascota) {
        System.out.println("Datos mostrados en la web:");
        System.out.println("Tipo   : " + mascota.getTipo());
        System.out.println("Nombre : " + mascota.getNombre());
        System.out.println("Edad   : " + mascota.getEdad());
    }
}