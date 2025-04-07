package Command.app;

import Command.model.AumentarVolume;
import Command.model.DiminuirVolume;
import Command.model.PausarComando;
import Command.model.TocaMusicaComando;
import Command.service.ListaDeComandos;
import Command.service.Tocador;

public class TestaListaDeComandos {
    public static void main(String[] args) {
        
        // Instanciar o Receiver via Singleton
        Tocador tocador = Tocador.getInstance();

        // Instanciando o Invoker via Singleton
        ListaDeComandos listaDeComandos = ListaDeComandos.getInstance();
 
        // Cada ConcreteCommand (TocaMusicaComando, Pausa Comando, AumentarVolumeComando, DiminuirVolumeComando)
        // È armazenado na lista de comandos (Invoker)
        // Aqui tambem aplicamos o padrão de projeto Flyweight
        // para não instanciar o mesmo objeto mais de uma vez

        listaDeComandos.adicionarComando(new TocaMusicaComando(tocador, "musica1.mp3"));
        listaDeComandos.adicionarComando(new AumentarVolume(tocador, 2));
        listaDeComandos.adicionarComando(new TocaMusicaComando(tocador, "musica2.mp3"));
        listaDeComandos.adicionarComando(new AumentarVolume(tocador, 7));
        listaDeComandos.adicionarComando(new TocaMusicaComando(tocador, "musica3.mp3"));
        listaDeComandos.adicionarComando(new DiminuirVolume(tocador, 5));
        listaDeComandos.adicionarComando(new PausarComando(tocador, "musica3.mp3"));
        listaDeComandos.adicionarComando(new TocaMusicaComando(tocador, "musica4.mp3"));
        listaDeComandos.adicionarComando(new AumentarVolume(tocador, 10));

        // Executar os comandos
        listaDeComandos.executarComandos(tocador);
    }
}
