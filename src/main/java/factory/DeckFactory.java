package factory;

import cards.Card;
import cards.Rank;
import cards.Suit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeckFactory {
    private static final List<Suit> suits = List.of(Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS, Suit.SPADES);

    private DeckFactory() {
    }

    public static List<Card> createDeck(GameType gameType) {
        Rank[] ranks = gameType.getRanks();
        return suits.stream()
                .flatMap(suit ->
                        Arrays.stream(ranks).map(rank -> new Card(suit, rank, rank.getValue()))
                ).collect(Collectors.toList());
    }

}
