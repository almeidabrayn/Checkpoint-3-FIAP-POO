package Aula7;

public class Dispositivo {
    private String modelo;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    // Contrato padrão
    public double calcularConsumoEnergia() {
        return 0.0;
    }
}