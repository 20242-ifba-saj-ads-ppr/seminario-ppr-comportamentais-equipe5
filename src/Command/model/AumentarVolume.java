package Command.model;

import Command.service.Tocador;

public class AumentarVolume implements Comando {
    private Tocador tocador;
    private int nivel;

    public AumentarVolume(Tocador tocador, int nivel) {
        setTocador(tocador);
        setNivel(nivel);
    }

    @Override
    public String executar(Tocador tocador) {
        return getTocador().aumentarVolume(getNivel());
    }

    public Tocador getTocador() {
        return tocador;
    }

    public void setTocador(Tocador tocador) {
        this.tocador = tocador;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
