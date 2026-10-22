package Aula8;

public class Smartphone extends Dispositivo {
    public Smartphone(String modelo) {
        super(modelo);
    }

    // OBRIGATÓRIO implementar, pois a mãe é abstract
    @Override
    public double calcularConsumoEnergia() {
        return 5.0;
    }
}