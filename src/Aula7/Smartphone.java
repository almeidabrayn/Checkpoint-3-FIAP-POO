package Aula7;

public class Smartphone extends Dispositivo {
    public Smartphone(String modelo) { super(modelo); }

    @Override // Sobrescrevendo o comportamento
    public double calcularConsumoEnergia() {
        return 5.0; // Celular gasta 5% por hora
    }
}