package Aula8;

public class Tablet extends Dispositivo {
    public Tablet(String modelo) {
        super(modelo);
    }

    // OBRIGATÓRIO implementar, pois a mãe é abstract
    @Override
    public double calcularConsumoEnergia() {
        return 8.0;
    }
}