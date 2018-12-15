package character;

import behaviour.KickBehaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {

    @Getter @Setter
    private int power;
    @Getter
    private int hp;

    private KickBehaviour behaviour;

    public void kick(Character c) {
        behaviour.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }

        this.hp = hp;
    }

}
