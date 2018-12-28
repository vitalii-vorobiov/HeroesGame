import character.Character;
import factory.CharacterFactory;
import factory.GameManager;
import org.reflections.Reflections;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        CharacterFactory characterFactory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();

        gameManager.fight(character1, character2);

    }
}
