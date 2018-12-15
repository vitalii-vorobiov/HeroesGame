package behaviour;

import character.Character;

public class OrdinaryKick implements KickBehaviour {

    public void kick(Character c1, Character c2) {
        c2.setHp(c2.getHp() - c1.getPower());
    }

}
