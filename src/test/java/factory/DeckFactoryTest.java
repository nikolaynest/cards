package factory;

import cards.Card;
import cards.Suit;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckFactoryTest {

    @Test
    public void testCreatePoker() {
        List<Card> deck = DeckFactory.createDeck(GameType.POKER);
        int expectedDeckLength = GameType.POKER.getRanks().length * Suit.values().length;

        assertEquals(expectedDeckLength, deck.size());
    }

    @Test
    public void testCreateFool() {
        List<Card> deck = DeckFactory.createDeck(GameType.FOOL);
        int expectedDeckLength = GameType.FOOL.getRanks().length * Suit.values().length;

        assertEquals(expectedDeckLength, deck.size());
    }

    @Test
    public void testCreatePreference() {
        List<Card> deck = DeckFactory.createDeck(GameType.PREFERENCE);
        int expectedDeckLength = GameType.PREFERENCE.getRanks().length * Suit.values().length;

        assertEquals(expectedDeckLength, deck.size());
    }

}
