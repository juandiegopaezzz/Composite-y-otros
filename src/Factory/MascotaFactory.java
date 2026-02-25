package factory;

import Entradas.InputMascota;
import Salidas.OutputMascota;

public interface MascotaFactory {
    InputMascota crearInput();
    OutputMascota crearOutput();
}