package Aula6;

// Tablet É UM Dispositivo (Herança)
public class Tablet extends Dispositivo {
    private boolean temCaneta;

    public Tablet(String marca, String modelo, boolean temCaneta) {
        super(marca, modelo); // Repassa marca e modelo para a classe mãe
        this.temCaneta = temCaneta;
    }

    public boolean isTemCaneta() {
        return temCaneta;
    }
}