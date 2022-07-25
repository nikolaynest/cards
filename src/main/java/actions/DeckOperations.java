package actions;

import cards.Card;
import rools.Rules;

import java.util.LinkedList;
import java.util.List;

public interface DeckOperations {

    List<Card> createDeck(Rules rules);
    List<Card> shuffle(List<Card> deck);
    Card pop(LinkedList<Card> deck);
    void print(List<Card> deck);
}
