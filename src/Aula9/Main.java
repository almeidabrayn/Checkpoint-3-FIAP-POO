// Aula 9 - O Contrato de Comportamento - Interfaces
package Aula9;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 9: Interfaces ---");

        Smartphone celular = new Smartphone("Pixel 8");
        Tablet tablet = new Tablet("Galaxy Tab S9");

        // Array do tipo da Interface.
        // Prova que objetos de classes diferentes podem ser tratados da mesma forma!
        Recarregavel[] aparelhos = { celular, tablet };

        System.out.println("Ligando todos na tomada:");
        for (Recarregavel aparelho : aparelhos) {
            aparelho.recarregar(100);
        }

        System.out.println("\nCalculando consumo de energia:");
        System.out.println("Consumo do Celular: " + celular.calcularConsumoEnergia() + "% por hora.");
        System.out.println("Consumo do Tablet: " + tablet.calcularConsumoEnergia() + "% por hora.");
    }
}