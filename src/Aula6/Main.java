// Aula 6 - A Árvore Genealógica - Herança (Generalização)
package Aula6;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 6: Herança ---");

        Smartphone meuPhone = new Smartphone("Apple", "iPhone 14", true);
        Tablet meuTablet = new Tablet("Samsung", "Galaxy Tab S8", true);

        // Mostrando que herdou os métodos getMarca e getModelo da classe Dispositivo
        System.out.println("Smartphone: " + meuPhone.getMarca() + " " + meuPhone.getModelo() + " | Tem 5G? " + meuPhone.isTem5G());
        System.out.println("Tablet: " + meuTablet.getMarca() + " " + meuTablet.getModelo() + " | Tem caneta? " + meuTablet.isTemCaneta());
    }
}