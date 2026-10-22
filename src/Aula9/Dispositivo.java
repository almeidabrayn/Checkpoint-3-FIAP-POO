package Aula9;

public abstract class Dispositivo {
    private String modelo;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract double calcularConsumoEnergia();
}