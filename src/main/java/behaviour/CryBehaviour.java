package behaviour;

import character.Character;

public class CryBehaviour implements KickBehaviour {

    public void kick(Character c1, Character c2) {
        toCry();
    }

    private void toCry() {
        System.out.println("Cry, cry, cry!!!");
    }

}
