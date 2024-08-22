package oving6.Highscore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class HighscoreList {

  private Integer[] scores;
  private Collection<HighscoreListListener> listeners = new ArrayList<>();

  public HighscoreList(int arrSize) {
    if (arrSize > 0) {
      this.scores = new Integer[arrSize];
      Arrays.fill(this.scores, 0);
    }
  }

  public int size() {
    return this.scores.length;
  }

  public int getElement(int index) {
    return this.scores[index];
  }

  public void addResult(int newResult) {
    if (newResult > this.scores[0]) {
      this.scores[0] = newResult; // add bottom of array/replacing worst place
      Arrays.sort(this.scores); // sort array, highest item is last

      // Send notification to listener:
      sendAlert(this.scores);
    } else {
      System.out.println(
        "Score too shit, lowest score is: " + this.scores[this.size() - 1]
      );
    }
  }

  public String toString() {
    String s = "score: ";
    for (int i : this.scores) {
      s += i + " ";
    }
    return s;
  }

  public void addHighscoreListListener(HighscoreListListener listener) {
    if (!this.listeners.contains(listener)) {
      this.listeners.add(listener);
    } else {
      throw new IllegalArgumentException("Something is not right...");
    }
  }

  public void removeHighscoreListListener(HighscoreListListener listener) {
    if (this.listeners.contains(listener)) {
      this.listeners.remove(listener);
    } else {
      throw new IllegalArgumentException("Listener not in list bro.");
    }
  }

  private void sendAlert(Integer[] scores) {
    this.listeners.forEach(listener -> listener.listChanged(scores));
  }
  /*
  public static void main(String[] args) {
    HighscoreList hslist = new HighscoreList(4);
  
    hslist.addResult(3);
    hslist.addResult(2);
    hslist.addResult(4);
    System.out.println(hslist.toString());
  }
  */
}
