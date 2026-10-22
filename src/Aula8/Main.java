// Aula 8 - O Molde Invisível - Classes Abstratas
package Aula8;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 8: Classes Abstratas ---");

        // Se você descomentar a linha abaixo, o Java vai dar erro de compilação!
        // Dispositivo d = new Dispositivo("Genérico");

        // Só podemos criar as filhas concretas
        Dispositivo celular = new Smartphone("iPhone 15 Pro");
        Dispositivo tablet = new Tablet("Galaxy Tab S9");

        System.out.println("Celular criado: " + celular.getModelo());
        System.out.println("Consumo do Tablet: " + tablet.calcularConsumoEnergia() + "% por hora.");
    }
}