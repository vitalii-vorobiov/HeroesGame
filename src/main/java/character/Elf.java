package character;

import behaviour.CryBehaviour;

public class Elf extends Character {

    public Elf() {
        super(10, 10, new CryBehaviour());
    }
}
