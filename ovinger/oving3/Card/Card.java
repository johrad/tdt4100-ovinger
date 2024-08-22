// Great video: https://youtu.be/aj9N5dQXFpE?t=154
package oving3.Card;

public class Card {

  final char cardType;
  final int cardNum;

  public Card(char type, int num) {
    if (type == 'S' || type == 'H' || type == 'D' || type == 'C') {
      this.cardType = type;
    } else {
      throw new IllegalArgumentException(
        "Can only have cards of color S,H,D or C"
      );
    }
    if (num >= 1 && num <= 13) {
      this.cardNum = num;
    } else {
      throw new IllegalArgumentException(
        "Can only have cards of value between 1 and 13"
      );
    }
  }

  public char getSuit() {
    return this.cardType;
  }

  public int getFace() {
    return this.cardNum;
  }

  public String toString() {
    return String.format("%c%d", this.cardType, this.cardNum); // todo: fix formatting here
  }

  public static void main(String[] args) {
    System.out.println("The card is:");
    Card card1 = new Card('S', 12);
    // String foo = card1.toString();
    System.out.println(card1.toString());
  }
}
