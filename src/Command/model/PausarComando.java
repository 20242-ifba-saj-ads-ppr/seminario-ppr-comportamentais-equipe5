package Command.model;

import Command.service.Tocador;

public class PausarComando implements Comando {
    private Tocador tocador;
    private String nomeArquivo;

    public PausarComando(Tocador tocador, String nomeArquivo) {
        setTocador(tocador);
        setNomeArquivo(nomeArquivo);
    }

    @Override
    public String executar(Tocador tocador) {
        return getTocador().pausar(getNomeArquivo());
    }

    public Tocador getTocador() {
        return tocador;
    }

    public void setTocador(Tocador tocador) {
        this.tocador = tocador;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
}
