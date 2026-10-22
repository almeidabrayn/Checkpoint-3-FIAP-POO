package Aula6;

// Smartphone É UM Dispositivo
public class Smartphone extends Dispositivo {
    private boolean tem5G;

    public Smartphone(String marca, String modelo, boolean tem5G) {
        super(marca, modelo); // Repassa para a classe mãe
        this.tem5G = tem5G;
    }

    public boolean isTem5G() { return tem5G; }
}