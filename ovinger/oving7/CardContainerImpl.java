package oving7;

import java.util.ArrayList;

public class CardContainerImpl implements CardContainer {

  protected ArrayList<Card> cards;
  private int maxCardCount;

  public CardContainerImpl(int maxCardCount) {
    this.maxCardCount = maxCardCount;
  }

  public int getMaxCardCount() {
    return this.maxCardCount;
  }

  public void setMaxCardCount(int maxCardCount) {
    this.maxCardCount = maxCardCount;
  }

  public CardContainerImpl() {}

  public CardContainerImpl(ArrayList<Card> cards) {
    if (cardsValid(cards)) {
      this.cards = cards;
    } else {
      throw new IllegalStateException();
    }
  }

  private boolean cardsValid(ArrayList<Card> cards) {
    return (cards.size() <= this.maxCardCount);
  }

  @Override
  public int getCardCount() {
    return cards.size();
  }

  @Override
  public Card getCard(int i) throws IllegalArgumentException {
    if (i < 0 || i >= getCardCount()) {
      throw new IllegalArgumentException(
        String.format(
          "%s is an illegal card index, when the size of the deck is %s",
          i,
          getCardCount()
        )
      );
    }
    return cards.get(i);
  }
}
