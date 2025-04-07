public abstract class SpellCasting {

  protected abstract String chooseSpell();
  
  protected abstract void gatherIngredients(String spell);
  
  protected abstract void castSpell(String spell);

  public final void prepareSpell() {
    String spell = chooseSpell();
    System.out.println("Magia escolhida: " + spell + ".");
    gatherIngredients(spell);
    castSpell(spell);
  }
}
