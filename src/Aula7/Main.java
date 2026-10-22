// Aula 7 - Muitas Formas - Polimorfismo de Sobrescrita
package Aula7;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 7: Polimorfismo ---");

        Dispositivo celular = new Smartphone("Galaxy S22");
        Dispositivo tablet = new Tablet("iPad Pro");

        // O mesmo comando chama métodos diferentes!
        System.out.println("Consumo do Celular: " + celular.calcularConsumoEnergia() + "% por hora.");
        System.out.println("Consumo do Tablet: " + tablet.calcularConsumoEnergia() + "% por hora.");
    }
}