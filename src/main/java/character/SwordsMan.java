package character;

import behaviour.RandomKick;
import config.Config;

public class SwordsMan extends Character {

    public SwordsMan(int min, int max) {
        super(Config.generateRandom(min, max), Config.generateRandom(min, max), new RandomKick());
    }



}
