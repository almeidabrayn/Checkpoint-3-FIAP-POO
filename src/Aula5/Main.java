// Aula 5 - Quando os Objetos Conversam - Relacionamentos (Associação)
package Aula5;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 5: Associação ---");

        // 1. Criamos a bateria (objeto independente)
        Bateria minhaBateria = new Bateria(5000);

        // 2. Passamos a bateria para o celular (associação)
        Celular meuCelular = new Celular("Samsung S23", minhaBateria);

        System.out.println("Celular: " + meuCelular.getModelo());
        System.out.println("Carga inicial: " + meuCelular.getBateria().getNivelCarga() + "%");

        // 3. Usando o comportamento que mexe na bateria
        meuCelular.recarregar(80);

        System.out.println("Carga após recarga: " + meuCelular.getBateria().getNivelCarga() + "%");
    }
}