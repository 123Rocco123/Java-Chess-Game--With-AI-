// Java Chess Game
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class chessgame {
  public static void initializingGame() {
    Pieces rook1 = new Pieces();
    Pieces rook2 = new Pieces();
    rook1.positionSetter(0, "R1");
    rook2.positionSetter(7, "R2");

    Pieces knight1 = new Pieces();
    Pieces knight2 = new Pieces();
    knight1.positionSetter(1, "K1");
    knight2.positionSetter(6, "K2");

    Pieces Bishop1 = new Pieces();
    Pieces Bishop2 = new Pieces();
    Bishop1.positionSetter(2, "K1");
    Bishop2.positionSetter(5, "K2");

    Pieces Queen = new Pieces();
    Queen.positionSetter(3, "Qu");

    Pieces King = new Pieces();
    King.positionSetter(4, "Ki");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("To start a new game write \"New Game\"");
    String Answer = input.nextLine();

    if (Answer.equals("New Game")) {
      initializingGame();
    }
  }
}
