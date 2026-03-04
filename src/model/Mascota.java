package model;

public class Mascota implements Cloneable {
    private String tipo;
    private String nombre;
    private double edad;

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(double edad) { this.edad = edad; }

    public String getTipo() { return tipo; }
    public String getNombre() { return nombre; }
    public double getEdad() { return edad; }

    @Override
    public Mascota clone() {
        try {
            return (Mascota) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}   