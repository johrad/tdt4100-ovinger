package oving7;

import java.util.ArrayList;

public class CardDeck extends CardContainerImpl {

  public CardDeck(int suitSize) {
    super(52);
    cards = new ArrayList<Card>();
    for (int i = 0; i < Card.SUITS.length(); i++) {
      for (int face = 1; face <= suitSize; face++) {
        Card card = new Card(Card.SUITS.charAt(i), face);
        cards.add(card);
      }
    }
  }

  public CardDeck(ArrayList<Card> cards) {
    super(52);
  }

  @Override
  public String toString() {
    return "[Deck " + cards.toString().substring(1);
  }

  public void deal(CardHand hand, int handSize) {
    for (int i = 0; i < handSize; i++) {
      hand.addCard(cards.remove(cards.size() - 1));
    }
  }

  public int getCardCount() {
    return cards.size();
  }

  public void shufflePerfectly() {
    int halfSize = cards.size() / 2;
    for (int i = 0; i < halfSize; i++) {
      Card card = cards.remove(halfSize + i);
      cards.add(i * 2 + 1, card);
    }
  }
}
