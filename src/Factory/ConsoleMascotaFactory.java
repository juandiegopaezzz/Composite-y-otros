package factory;

import Entradas.InputMascota;
import Entradas.ConsoleInputMascota;
import Salidas.OutputMascota;
import Salidas.ConsoleOutputMascota;

public class ConsoleMascotaFactory implements MascotaFactory {

    @Override
    public InputMascota crearInput() {
        return new ConsoleInputMascota();
    }

    @Override
    public OutputMascota crearOutput() {
        return new ConsoleOutputMascota();
    }
}