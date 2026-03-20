package school.faang.managespells;

public class SpellCaster {
    public void cast(String spell, SpellAction spellAction) {
        System.out.println(spellAction.act(spell));
    }
}
