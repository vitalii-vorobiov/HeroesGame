package factory;

import character.*;
import character.Character;
import config.Config;
import lombok.SneakyThrows;

import java.util.HashMap;

public class CharacterFactory {

    private HashMap<Integer, Class<? extends Character>> hm = new HashMap<Integer, Class<? extends Character>>();

    public CharacterFactory() {
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);

    }

    @SneakyThrows
    public Character createCharacter() throws IllegalAccessException, InstantiationException {
        return hm.get(Config.generateRandom(0, hm.size() - 1)).getDeclaredConstructor().newInstance();
//        return hm.get(Config.generateRandom(0, hm.size())).getDeclaredConstructor().newInstance();
//        return hm.get(Config.generateRandom(0, hm.size() - 1)).getConstructor().newInstance();
//        return hm.get(Config.generateRandom(0, hm.size() - 1)).newInstance();
    }
}
