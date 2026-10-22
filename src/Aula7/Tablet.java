package Aula7;

public class Tablet extends Dispositivo {
    public Tablet(String modelo) { super(modelo); }

    @Override
    public double calcularConsumoEnergia() {
        return 8.0; // Tablet gasta 8% por hora
    }
}