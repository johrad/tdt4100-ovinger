package oving6.Highscore;

import java.util.Arrays;

public class Listener implements HighscoreListListener {

  @Override
  public void listChanged(Integer[] newList) {
    System.out.println("new score-list:");
    Arrays.stream(newList).forEach(System.out::println);
  }
}
