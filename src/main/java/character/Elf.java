package character;

import behaviour.OrdinaryKick;

public class Elf extends Character {

    public Elf() {
        super(10, 10, new OrdinaryKick());
    }
}
