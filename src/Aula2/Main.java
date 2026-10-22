// Aula 2 - Métodos e Comportamentos
package Aula2;

public class Main {
    public static void main(String[] args) {
        // Instanciando o objeto
        System.out.println("--- AULA 2: Métodos e Comportamentos ---");
        Celular meuCelular = new Celular("Samsung Galaxy S23", 128.0);

        System.out.println("--- Sistema do Celular ---");
        System.out.println("Modelo: " + meuCelular.getModelo());
        System.out.println("Armazenamento Total: " + meuCelular.getArmazenamentoTotal() + " GB");
        System.out.println("Armazenamento Usado: " + meuCelular.getArmazenamentoUsado() + " GB\n");

        // Testando regras de negócio
        System.out.println(">> Instalando WhatsApp (2 GB)");
        meuCelular.instalarApp(2.0);

        System.out.println("\n>> Tirando foto (0.5 GB)");
        meuCelular.tirarFoto(0.5);

        System.out.println("\n>> Tentando instalar jogo pesado (200 GB) - Deve dar erro!");
        meuCelular.instalarApp(200.0);

        System.out.println("\n>> Tentando tirar foto com tamanho negativo ( -1 GB) - Deve dar erro!");
        meuCelular.tirarFoto(-1.0);

        System.out.println("\n>> Liberando espaço (1 GB)");
        meuCelular.liberarEspaco(1.0);

        System.out.println("\n>> Tentando liberar mais espaço do que o usado (100 GB) - Deve dar erro!");
        meuCelular.liberarEspaco(100.0);
    }
}