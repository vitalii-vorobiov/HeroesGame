package factory;

import character.Character;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());


        System.out.println(c1.getHp());
        System.out.println(c2.getHp());

        c1.kick(c2);
        c2.kick(c1);

        System.out.println(c1.getHp());
        System.out.println(c2.getHp());

        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }

}
