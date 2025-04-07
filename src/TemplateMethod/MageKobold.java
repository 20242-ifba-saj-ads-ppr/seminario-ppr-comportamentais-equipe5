package TemplateMethod;
public class MageKobold {

    private SpellCasting spellCastingMethod;

    public MageKobold(SpellCasting spellCastingMethod) {
        this.spellCastingMethod = spellCastingMethod;
    }

    public void prepareSpell() {
        spellCastingMethod.prepareSpell();
    }

    public void changespellCastingMethod(SpellCasting spellCastingMethod) {
        this.spellCastingMethod = spellCastingMethod;
    }

    public static void main(String[] args) {
        var mage = new MageKobold(new FireBallSpell());
        mage.prepareSpell();
        mage.changespellCastingMethod(new InvisibilitySpell());
        mage.prepareSpell();
    }

}
