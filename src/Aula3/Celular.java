package Aula3;

public class Celular {
    // Atributos privados (Aula 3)
    private String modelo;
    private double armazenamentoTotal;
    private double armazenamentoUsado;

    public Celular(String modelo, double armazenamentoTotal) {
        this.modelo = modelo;
        this.armazenamentoTotal = armazenamentoTotal;
        this.armazenamentoUsado = 0.0;
    }

    // Getters e Setters com regras de negócio
    public String getModelo() { return modelo; }

    public double getArmazenamentoTotal() { return armazenamentoTotal; }

    public double getArmazenamentoUsado() { return armazenamentoUsado; }

    private void setArmazenamentoUsado(double armazenamentoUsado) {
        if (armazenamentoUsado >= 0 && armazenamentoUsado <= this.armazenamentoTotal) {
            this.armazenamentoUsado = armazenamentoUsado;
        } else {
            System.out.println("Erro: Armazenamento inválido!");
        }
    }

    public void tirarFoto(double tamanhoFoto) {
        if (tamanhoFoto <= 0 || (this.armazenamentoUsado + tamanhoFoto) > this.armazenamentoTotal) {
            System.out.println("Erro: Sem espaço ou tamanho inválido!");
            return;
        }
        setArmazenamentoUsado(this.armazenamentoUsado + tamanhoFoto);
        System.out.println("Foto tirada! Espaço usado: " + this.armazenamentoUsado + " GB");
    }
}