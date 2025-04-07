public class FireBallSpell extends SpellCasting {

    @Override
    protected String chooseSpell() {
      return "Bola de Fogo";
    }
  
    @Override
    protected void gatherIngredients(String spell) {
      System.out.println("Reunindo um pouco de guano de morcego e enxofre para " + spell + ".");
    }
  
    @Override
    protected void castSpell(String spell) {
      System.out.println("Pelas chamas ancestrais que moldaram o mundo, eu invoco o fogo primordial! Queime tudo em seu caminho," + spell + "!");
    }
  }
  