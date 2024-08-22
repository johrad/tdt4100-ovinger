package oving3.Card;

import java.util.ArrayList;

public class CardDeck {

  private Card[] cards;

  public CardDeck(int nCards) {
    this.cards = new Card[nCards];
  }

  public String toString() {
    return "card deck contains:" + cards;
  }

  public static void main(String[] args) {
    Card newCard = new Card('S', 12);
    CardDeck newCardDeck = new CardDeck(2);
    String a = newCardDeck.toString();
    System.out.println(a);
  }
}
