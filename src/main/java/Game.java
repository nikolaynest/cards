import actions.DeckOperations;
import cards.Card;
import rools.Rules;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private final Rules rules;
    private final List<Player> players = new ArrayList<>();
    private final LinkedList<Card> deck = new LinkedList<>();
    private final DeckOperations deckOperations;

    private Game(Rules rules, DeckOperations deckOperations) {
        this.deckOperations = deckOperations;
        this.rules = rules;
        initDeck();
        initPlayers();
    }

    public static Game startTheGame(Rules rules, DeckOperations deckOperations) {
        return new Game(rules, deckOperations);
    }

    public Card getNextCard() {
        return deckOperations.pop(deck);
    }

    public void dealCards() {
        players.forEach(player -> {
            for (int i = 0; i < rules.dealtCards(); i++) {
                player.getHoldCards().add(getNextCard());
            }
        });
    }

    private void initDeck() {
        deck.addAll(deckOperations.shuffle(deckOperations.createDeck(rules)));
    }
    private void initPlayers() {
        for (int i = 0; i < rules.playersNumber(); i++) {
            players.add(new Player());
        }
    }
}
