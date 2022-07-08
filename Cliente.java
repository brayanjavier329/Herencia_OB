package Herencia;

//hereda de persona
public class Cliente extends Persona {
    float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
}
