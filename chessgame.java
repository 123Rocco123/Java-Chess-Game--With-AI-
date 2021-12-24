// Java Chess Game
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class chessgame {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("To start a new game write \"New Game\"");
      String Answer = input.nextLine();
  }

  public static void initializingGame() {
    Pieces newSetup = new Pieces();
  }
}
