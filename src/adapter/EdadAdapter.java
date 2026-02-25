package adapter;

public class EdadAdapter implements Edad {

    private double edad;

    public EdadAdapter(String edadTexto) {
        try {
            this.edad = Double.parseDouble(edadTexto);
        } catch (NumberFormatException e) {
            this.edad = 0.0; 
        }
    }

    @Override
    public double getEdad() {
        return edad;
    }
}