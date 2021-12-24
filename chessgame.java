// Java Chess Game
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class chessgame {
  // The function below is used to set the Player's chess pieces at the start of a new game.
  public static void initializingGame() {
    Pieces rook1 = new Pieces();
    Pieces rook2 = new Pieces();
    rook1.positionSetter(0, "|R1|");
    rook2.positionSetter(7, "|R2|");

    Pieces knight1 = new Pieces();
    Pieces knight2 = new Pieces();
    knight1.positionSetter(1, "|K1|");
    knight2.positionSetter(6, "|K2|");

    Pieces Bishop1 = new Pieces();
    Pieces Bishop2 = new Pieces();
    Bishop1.positionSetter(2, "|B1|");
    Bishop2.positionSetter(5, "|B2|");

    Pieces Queen = new Pieces();
    Queen.positionSetter(3, "|Qu|");

    Pieces King = new Pieces();
    King.positionSetter(4, "|Ki|");

    Board startGameBoard = new Board();
    startGameBoard.BoardSetter();

    startGameBoard.pieceAddition(rook1.startingLocation, rook1.piece);
    startGameBoard.pieceAddition(rook2.startingLocation, rook2.piece);

    startGameBoard.pieceAddition(knight1.startingLocation, knight1.piece);
    startGameBoard.pieceAddition(knight2.startingLocation, knight2.piece);

    startGameBoard.pieceAddition(Bishop1.startingLocation, Bishop1.piece);
    startGameBoard.pieceAddition(Bishop2.startingLocation, Bishop2.piece);

    startGameBoard.pieceAddition(Queen.startingLocation, Queen.piece);

    startGameBoard.pieceAddition(King.startingLocation, King.piece);

    for (int i = 0; i < (startGameBoard.ChessBoard).size(); i++) {
      if (i % 8 == 0) {
        System.out.println();
        System.out.print((startGameBoard.ChessBoard).get(i));
      } else {
        System.out.print((startGameBoard.ChessBoard).get(i));
      }
    }
  }

  // The function below is used to ask the user if they want to start the game or not.
  public static void startFunction() {
    Scanner input = new Scanner(System.in);

    System.out.println("To start a new game write \"New Game\"");
    String Answer = input.nextLine();

    if (Answer.equals("New Game")) {
      initializingGame();
    } else {
      System.out.println("Invalid Input\n");
      startFunction();
    }
  }

  public static void main(String[] args) {
    startFunction();
  }
}
