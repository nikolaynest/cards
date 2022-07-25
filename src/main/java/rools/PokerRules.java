package rools;

import factory.GameType;

public class PokerRules implements Rules {
    @Override
    public GameType gameType() {
        return GameType.POKER;
    }

    @Override
    public int playersNumber() {
        return 6;
    }

    @Override
    public int dealtCards() {
        return 5;
    }

    @Override
    public void foldCards() {
        System.out.println("Game finished.");
    }
}
