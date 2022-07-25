package actions;

import cards.Card;
import factory.DeckFactory;
import factory.GameType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckOperationsImplTest {

    private DeckOperations deckOperations;

    @BeforeEach
    public void init() {
        deckOperations = new DeckOperationsImpl();
    }

    @Test
    public void testShuffle() {
        List<Card> deck = DeckFactory.createDeck(GameType.POKER);
        for (int i = 0; i < 10; i++) {
            List<Card> shuffled = deckOperations.shuffle(deck);

            assertEquals(deck.size(), shuffled.size());

            deck = shuffled;
        }
    }


}
