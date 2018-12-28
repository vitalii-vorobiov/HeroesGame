package factory;

import character.Character;

public class GameManager {

    public void fight(Character c1, Character c2) {

        String c1Name = c1.getClass().getSimpleName();
        String c2Name = c2.getClass().getSimpleName();

        System.out.println(String.format("Fight between %s and %s\n", c1Name, c2Name));

        while (c1.isAlive() && c2.isAlive()) {
            if (c1Name.equals("Hobbit") && c2Name.equals("Hobbit")) {
                System.out.println("Hobbits can't fight together");
                break;
            }

            System.out.println(String.format("%s:\n" +
                    "HP: %s\n" +
                    "Power: %s\n", c1Name, c1.getHp(), c1.getPower()));
            System.out.println(String.format("%s:\n" +
                    "HP: %s\n" +
                    "Power: %s\n", c2Name, c2.getHp(), c2.getPower()));

            c1.kick(c2);
            c2.kick(c1);
        }

        System.out.println(String.format("%s has wone!!!", c1.isAlive() ? c1Name : c2Name));
    }

}
