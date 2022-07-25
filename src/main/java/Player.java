import cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> holdCards = new ArrayList<>();

    public List<Card> getHoldCards() {
        return holdCards;
    }

    public void setHoldCards(List<Card> holdCards) {
        this.holdCards = holdCards;
    }
}
