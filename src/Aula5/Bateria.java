package Aula5;

public class Bateria {
    private int capacidadeMah;
    private int nivelCarga;

    public Bateria(int capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
        this.nivelCarga = 0;
    }

    public int getNivelCarga() { return nivelCarga; }

    public void setNivelCarga(int nivelCarga) {
        if(nivelCarga >= 0 && nivelCarga <= 100) {
            this.nivelCarga = nivelCarga;
        }
    }
}