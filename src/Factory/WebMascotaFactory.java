package factory;

import Entradas.InputMascota;
import Entradas.WebInputMascota;
import Salidas.OutputMascota;
import Salidas.WebOutputMascota;

public class WebMascotaFactory implements MascotaFactory {

    @Override
    public InputMascota crearInput() {
        return new WebInputMascota();
    }

    @Override
    public OutputMascota crearOutput() {
        return new WebOutputMascota();
    }
}