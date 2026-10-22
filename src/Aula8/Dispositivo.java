package Aula8;

// A classe agora é abstrata (não pode ser instanciada)
public abstract class Dispositivo {
    private String modelo;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    // Método abstrato: OBRIGA as filhas a implementarem
    public abstract double calcularConsumoEnergia();
}