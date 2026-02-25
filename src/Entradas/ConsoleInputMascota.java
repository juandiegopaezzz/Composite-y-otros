package Entradas;

import java.util.Scanner;

public class ConsoleInputMascota implements InputMascota {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String pedirTipoMascota() {
        System.out.print("Ingrese el tipo de mascota: ");
        return scanner.nextLine();
    }

    @Override
    public String pedirNombreMascota() {
        System.out.print("Ingrese el nombre de la mascota: ");
        return scanner.nextLine();
    }

    @Override
    public String pedriEdadMascota() {
        System.out.println("Ingrese la edad de la mascota: ");
        return scanner.nextLine();
    }
}