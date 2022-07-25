package rools;

import factory.GameType;

public class FoolRules implements Rules {

    @Override
    public GameType gameType() {
        return GameType.FOOL;
    }
    @Override
    public int playersNumber() {
        return 2;
    }

    @Override
    public int dealtCards() {
        return 6;
    }

    @Override
    public void foldCards() {
        if (true) {//todo: some condition here
            System.out.println("The end of the game, someone lost.");
        }
    }

}
