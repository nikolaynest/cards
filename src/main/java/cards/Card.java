package cards;

public final class Card {

    private final Suit suit;
    private final Rank rank;
    private final int value;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.value = rank.getValue();

    }

    public Card(Suit suit, Rank rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public Suit getSuit(){
        return suit;
    }

    public int getValue() {
        return value;
    }

    public Rank getRank() {
        return rank;
    }

}
