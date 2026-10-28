package Aula4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AULA 4: Construtores ---");

        // TESTE 1: O nascimento correto (passando os dados obrigatórios)
        Celular meuCelular = new Celular("Samsung S23", 128.0);

        // TESTE 2: Tentando criar um celular "fantasma" (Vai dar erro se descomentar!)
        // Celular celularFantasma = new Celular();
        // ERRO: O Java vai dizer que o construtor vazio não existe mais!

        System.out.println("Modelo: " + meuCelular.getModelo());
        System.out.println("Armazenamento: " + meuCelular.getArmazenamentoTotal() + " GB");
    }
}