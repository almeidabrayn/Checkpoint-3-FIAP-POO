// Aula 3 - Protegendo o Sistema - Encapsulamento (Getters e Setters)
package Aula3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 3: Encapsulamento ---");
        Celular meuCelular = new Celular("iPhone 13", 128.0);

        // O atributo é private, então isso dá erro se tentar descomentar
        // meuCelular.armazenamentoUsado = 500.0;

        // Temos que usar o método
        meuCelular.tirarFoto(10.0);
        meuCelular.tirarFoto(200.0); // Vai dar erro (sem espaço), graças à validação!
    }
}