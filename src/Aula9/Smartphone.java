package Aula9;

// Herda de Dispositivo E assina o contrato Recarregavel
public class Smartphone extends Dispositivo implements Recarregavel {

    public Smartphone(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularConsumoEnergia() {
        return 5.0;
    }

    // Implementação do contrato da Interface
    @Override
    public void recarregar(int percentual) {
        if (percentual >= 0 && percentual <= 100) {
            System.out.println("Smartphone " + getModelo() + " carregado a " + percentual + "%");
        } else {
            System.out.println("Erro: Percentual inválido!");
        }
    }
}