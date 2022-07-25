package rools;

import factory.GameType;

public class PreferenceRules implements Rules {
    @Override
    public GameType gameType() {
        return GameType.PREFERENCE;
    }

    @Override
    public int playersNumber() {
        return 3;
    }

    @Override
    public int dealtCards() {
        return 10;
    }

    @Override
    public void foldCards() {
        System.out.println("The game ends when the conditions for its termination are met, depends on decision made before the game.");
    }
}
