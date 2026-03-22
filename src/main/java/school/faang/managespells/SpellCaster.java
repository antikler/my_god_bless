package school.faang.managespells;

public class SpellCaster {
    public void cast(String spell, SpellAction spellAction) {
        if (spell.isBlank()) {
            throw new IllegalArgumentException("Name is empty or contains only spaces!");
        }
        System.out.println(spellAction.act(spell));
    }
}
