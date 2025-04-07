package Command.service;

import java.util.ArrayList;
import java.util.List;

import Command.model.Comando;

public class ListaDeComandos {
    private static ListaDeComandos listaDeComandos;

    private List<Comando> comandos;

    private ListaDeComandos() {
        setComandos(new ArrayList<>());
    }
    /**
     * Singleton
     * @return ListaDeComandos
     */
    public static ListaDeComandos getInstance() {
        if (listaDeComandos == null) {
            listaDeComandos = new ListaDeComandos();
        }
        return listaDeComandos;
    }

    public void adicionarComando(Comando comando) {
        getComandos().add(comando);
    }

    public void executarComandos(Tocador tocador) {
        getComandos().stream().forEach(comando -> System.out.println(comando.executar(tocador)));
    }
    public List<Comando> getComandos() {
        return comandos;
    }

    public void setComandos(List<Comando> comandos) {
        this.comandos = comandos;
    }

}
