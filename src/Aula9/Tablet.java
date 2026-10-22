package Aula9;

// Herda de Dispositivo E assina o contrato Recarregavel
public class Tablet extends Dispositivo implements Recarregavel {

    public Tablet(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularConsumoEnergia() {
        return 8.0;
    }

    // Implementação do contrato da Interface
    @Override
    public void recarregar(int percentual) {
        if (percentual >= 0 && percentual <= 100) {
            System.out.println("Tablet " + getModelo() + " carregado a " + percentual + "%");
        } else {
            System.out.println("Erro: Percentual inválido!");
        }
    }
}