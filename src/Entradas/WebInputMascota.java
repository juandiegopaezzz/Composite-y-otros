package Entradas;

import java.awt.Desktop;
import java.io.File;

public class WebInputMascota implements InputMascota {

    private boolean webAbierta = false;

    @Override
    public String pedirTipoMascota() {
        abrirWebUnaVez();
        return "Tipo ingresado en Web";
    }

    @Override
    public String pedirNombreMascota() {
        return "Nombre ingresado en Web";
    }
    
    @Override
    public String pedriEdadMascota() {
        return "Edad ingresada en Web";
    }


private void abrirWebUnaVez() {
    if (webAbierta) return;

    try {
        File archivo = new File("formulariomascotas.html");

        if (!archivo.exists()) {
            System.out.println("❌ No se encontró el archivo HTML");
            return;
        }

        Desktop.getDesktop().browse(archivo.toURI());
        webAbierta = true;

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
}