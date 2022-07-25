package factory;

import cards.Rank;

public enum GameType {
    PREFERENCE(Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.ACE, Rank.JACK, Rank.QUEEN, Rank.KING),
    FOOL(Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.ACE, Rank.JACK, Rank.QUEEN, Rank.KING),
    POKER(Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE,
            Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN,
            Rank.ACE, Rank.JACK, Rank.QUEEN, Rank.KING);

    private final Rank[] ranks;

    GameType(Rank... ranks) {
        this.ranks = ranks;
    }

    public Rank[] getRanks() {
        return ranks.clone();
    }
}
