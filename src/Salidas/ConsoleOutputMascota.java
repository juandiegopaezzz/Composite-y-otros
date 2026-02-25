package Salidas;

public class ConsoleOutputMascota implements OutputMascota {

    @Override
    public void mostrarMascota(String tipo, String nombre, double edad) {
        System.out.println("----- DATOS DE LA MASCOTA -----");
        System.out.println("Tipo   : " + tipo);
        System.out.println("Nombre : " + nombre);
        System.out.println("EDad   : " + edad);
        System.out.println("------------------------------");
    }
}