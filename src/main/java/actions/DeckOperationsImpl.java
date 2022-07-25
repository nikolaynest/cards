package actions;

import cards.Card;
import factory.DeckFactory;
import rools.Rules;

import java.util.*;


public class DeckOperationsImpl implements DeckOperations {

    @Override
    public List<Card> createDeck(Rules rules) {
        return DeckFactory.createDeck(rules.gameType());
    }

    @Override
    public List<Card> shuffle(List<Card> deck) {
        List<Card> copy = new ArrayList<>(deck);
        Collections.shuffle(copy);
        return copy;
    }

    @Override
    public Card pop(LinkedList<Card> deck) {
        return deck.pop();
    }

    @Override
    public void print(List<Card> deck) {
        for (Card card: deck) {
            System.out.print(card.getSuit() + " " + card.getRank() + " " + card.getValue() + "\n");
        }
        System.out.println("---------------------");
    }
}
