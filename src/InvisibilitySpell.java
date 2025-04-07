public class InvisibilitySpell extends SpellCasting {

    @Override
    protected String chooseSpell() {
        return "Invisibilidade";
    }

    @Override
    protected void gatherIngredients(String spell) {
        System.out.println("Coletando cílio preso em goma arábica para conjurar  " + spell + ".");
    }

    @Override
    protected void castSpell(String spell) {
        System.out.println("Pelas sombras que ocultam o mundo, envolvo esta essência em véus de ilusão. " + spell + "!");
    }
}
