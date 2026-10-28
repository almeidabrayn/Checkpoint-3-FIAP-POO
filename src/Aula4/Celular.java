package Aula4;

public class Celular {
    private String modelo;
    private double armazenamentoTotal;

    // O CONSTRUTOR (Aula 4)
    // O Java não vai mais deixar criar new Celular() vazio.
    // Ele OBRIGA a passar o modelo e o armazenamento na hora do nascimento.
    public Celular(String modelo, double armazenamentoTotal) {
        this.modelo = modelo;
        this.armazenamentoTotal = armazenamentoTotal;
        System.out.println("Celular " + this.modelo + " fabricado com sucesso!");
    }

    // Getters (Apenas leitura)
    public String getModelo() {
        return modelo;
    }

    public double getArmazenamentoTotal() {
        return armazenamentoTotal;
    }

    // O professor pediu para não criar setters aleatórios.
    // O modelo de um celular não muda após a fabricação, então não teremos setModelo().
}