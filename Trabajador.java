package Herencia;

//hereda de persona
public class Trabajador extends Persona {
    float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}
