package Salidas;

import model.Mascota;

public class ConsoleOutputMascota implements OutputMascota {


    @Override
    public void mostrarMascota(Mascota mascota) {
        System.out.println("----- DATOS DE LA MASCOTA -----");
        System.out.println("Tipo   : " + mascota.getTipo());
        System.out.println("Nombre : " + mascota.getNombre());
        System.out.println("Edad   : " + mascota.getEdad());
        System.out.println("------------------------------");
    }
}