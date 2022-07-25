package rools;

import factory.GameType;

public interface Rules {
    GameType gameType();
    int playersNumber();
    int dealtCards();
    void foldCards();
}
