package Aula5;

public class Celular {
    private String modelo;
    private Bateria bateria; // AQUI ESTÁ A ASSOCIAÇÃO (Aula 5)

    public Celular(String modelo, Bateria bateria) {
        this.modelo = modelo;
        this.bateria = bateria; // O celular recebe um objeto Bateria inteiro
    }

    public Bateria getBateria() { return bateria; }
    public String getModelo() { return modelo; }

    public void recarregar(int porcentagem) {
        System.out.println("Recarregando " + modelo);
        this.bateria.setNivelCarga(porcentagem);
    }
}