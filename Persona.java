package Herencia;

//clase padre
public class Persona {
    private String nombre;
    private int telefono;
    private int edad;

    // setters y getters de los atributos privados de la clase padre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

}
