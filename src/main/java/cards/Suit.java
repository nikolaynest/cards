package cards;

public enum Suit {
    SPADES("spades"),
    HEARTS("hearts"),
    DIAMONDS("diamonds"),
    CLUBS("clubs");

    Suit(String suitValue) {
        this.suitValue = suitValue;
    }

    private final String suitValue;

    public String getSuitValue() {
        return this.suitValue;
    }
}