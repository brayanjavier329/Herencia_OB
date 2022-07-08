package Herencia;

public class Main {
    public static void main(String[] args) {
        // Objeto de la clase hija Cliente usando atributos propios y de su padre.
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos Perez");
        System.out.println(cliente.getNombre());
        cliente.setEdad(45);
        System.out.println(cliente.getEdad());
        cliente.setTelefono(3124547);
        System.out.println(cliente.getTelefono());
        cliente.setCredito(4500000);
        System.out.println(cliente.getCredito());

        // Objeto de la clase hija Trabajador usando atributos propios y de su padre.
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(22);
        System.out.println(trabajador.getEdad());
        trabajador.setTelefono(12256543);
        System.out.println(trabajador.getTelefono());
        trabajador.setNombre("Ernesto Gonzalez");
        System.out.println(trabajador.getNombre());
        trabajador.setSalario(455058);
        System.out.println(trabajador.getSalario());
    }
}
