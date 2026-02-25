package Salidas;

public class WebOutputMascota implements OutputMascota {

    @Override
    public void mostrarMascota(String tipo, String nombre,double edad) {
        System.out.println("Datos mostrados en la plataforma web:");
        System.out.println("Tipo   : " + tipo);
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad   : " + edad);
        System.out.println("(Visualizacion realizada en la web)");
    }
}