package Command.model;

import Command.service.Tocador;

public interface Comando {
    String executar(Tocador tocador);
}
