package config;

import java.util.Random;

public class Config {

    private static Random random = new Random();

    public static int generateRandom(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

}
