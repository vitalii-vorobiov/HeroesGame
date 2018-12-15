package behaviour;

import config.Config;
import character.Character;

public class RandomKick implements KickBehaviour {

    public void kick(Character c1, Character c2) {
        int kickPower = Config.generateRandom(0, c1.getPower());

        c2.setHp(c2.getHp() - kickPower);
    }

}
