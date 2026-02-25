package factory;

import Entradas.InputMascota;
import Entradas.JOptionInputMascota;
import Salidas.OutputMascota;
import Salidas.JOptionOutputMascota;

public class JOptionMascotaFactory implements MascotaFactory {

    @Override
    public InputMascota crearInput() {
        return new JOptionInputMascota();
    }

    @Override
    public OutputMascota crearOutput() {
        return new JOptionOutputMascota();
    }
}