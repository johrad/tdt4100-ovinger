package oving6.Highscore;

import java.io.Console;

public class HighscoreProgram {

  public static void main(String[] args) {
    Console console = System.console();
    HighscoreList hslist = new HighscoreList(3);
    Listener subscriber1 = new Listener();

    hslist.addHighscoreListListener(subscriber1);
    int score = 0;
    while (score != 69) {
      score = Integer.parseInt(console.readLine("Type new result: "));
      hslist.addResult(score);
    }
  }
}
