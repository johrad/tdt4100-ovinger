package oving7;

import java.util.ArrayList;

public class CardHand extends CardContainerImpl {

  public CardHand(int maxCards) {
    super(maxCards);
    cards = new ArrayList<Card>();
  }

  @Override
  public String toString() {
    return "[Hand " + cards.toString().substring(1);
  }

  public void addCard(Card card) {
    super.cards.add(card);
  }

  public Card play(int i) {
    return cards.remove(i);
  }
}
