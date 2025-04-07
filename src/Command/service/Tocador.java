package Command.service;

public class Tocador {
    private static Tocador tocador;

    private Tocador() {}

    public static Tocador getInstance() {
        if (tocador == null) {
            tocador = new Tocador();
        }
        return tocador;
    }

    public String tocar (String fileName) {
        return "Tocando: " + fileName + " /n Duration (s): "  + ((long) (Math.random() * 2000)) / 1000.0  + "/n Finished playing " + fileName;
    }
    public String pausar (String fileName) {
        return "Musica " + fileName + " pausada";
    }
    public String aumentarVolume (int nivel){
        return "Volume aumentado para " + nivel;
    }
    public String diminuirVolume (int nivel){
        return "Volume diminuido para " + nivel;
    }
}
