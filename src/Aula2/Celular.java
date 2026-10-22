package Aula2;

public class Celular {
    // Atributos (O que o celular TEM)
    private String modelo;
    private double armazenamentoTotal;
    private double armazenamentoUsado;

    // Construtor
    public Celular(String modelo, double armazenamentoTotal) {
        this.modelo = modelo;
        this.armazenamentoTotal = armazenamentoTotal;
        this.armazenamentoUsado = 0.0; // Começa vazio
    }

    // Método 1: Tirar Foto (Comportamento)
    public void tirarFoto(double tamanhoFoto) {
        // Regra de Negócio: Tamanho válido
        if (tamanhoFoto <= 0) {
            System.out.println("Erro: Tamanho da foto inválido.");
            return; // Interrompe o método
        }

        // Regra de Negócio: Espaço suficiente
        if (this.armazenamentoUsado + tamanhoFoto > this.armazenamentoTotal) {
            System.out.println("Erro: Memória cheia! Apague algo antes de tirar fotos.");
            return;
        }

        // Altera o estado do objeto
        this.armazenamentoUsado += tamanhoFoto;
        System.out.println("Foto tirada! (" + tamanhoFoto + " GB). Espaço usado: " + this.armazenamentoUsado + " GB");
    }

    // Método 2: Instalar App
    public void instalarApp(double tamanhoApp) {
        if (tamanhoApp <= 0) {
            System.out.println("Erro: Tamanho do app inválido.");
            return;
        }

        if (this.armazenamentoUsado + tamanhoApp > this.armazenamentoTotal) {
            System.out.println("Erro: Espaço insuficiente para instalar este app.");
            return;
        }

        this.armazenamentoUsado += tamanhoApp;
        System.out.println("App instalado com sucesso! (" + tamanhoApp + " GB). Espaço usado: " + this.armazenamentoUsado + " GB");
    }

    // Método 3: Liberar Espaço
    public void liberarEspaco(double espacoRemover) {
        if (espacoRemover <= 0) {
            System.out.println("Erro: Valor de remoção inválido.");
            return;
        }

        if (espacoRemover > this.armazenamentoUsado) {
            System.out.println("Erro: Você não pode liberar mais espaço do que o usado.");
            return;
        }

        this.armazenamentoUsado -= espacoRemover;
        System.out.println("Espaço liberado! (" + espacoRemover + " GB). Espaço usado: " + this.armazenamentoUsado + " GB");
    }

    // Getters para exibir as informações
    public String getModelo() {
        return modelo;
    }

    public double getArmazenamentoTotal() {
        return armazenamentoTotal;
    }

    public double getArmazenamentoUsado() {
        return armazenamentoUsado;
    }
}