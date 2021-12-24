// Java Chess Game
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class chessgame {
  public static void desiredLocation() {
    Scanner input = new Scanner(System.in);

    System.out.println("What piece do you want to move?");
    String pieceToMove = input.nextLine();

    System.out.println("Where do you want to move it?");
    String desiredLocation = input.nextLine();
  }

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

    Pieces Pawn1 = new Pieces();
    Pieces Pawn2 = new Pieces();
    Pieces Pawn3 = new Pieces();
    Pieces Pawn4 = new Pieces();
    Pieces Pawn5 = new Pieces();
    Pieces Pawn6 = new Pieces();
    Pieces Pawn7 = new Pieces();
    Pieces Pawn8 = new Pieces();
    Pawn1.positionSetter(8, "|P1|");
    Pawn2.positionSetter(9, "|P2|");
    Pawn3.positionSetter(10, "|P3|");
    Pawn4.positionSetter(11, "|P4|");
    Pawn5.positionSetter(12, "|P5|");
    Pawn6.positionSetter(13, "|P6|");
    Pawn7.positionSetter(14, "|P7|");
    Pawn8.positionSetter(15, "|P8|");

    // The object below is used to create a new board.
    Board startGameBoard = new Board();
    // The call below is to initialize the empty borad.
    startGameBoard.BoardSetter();

    startGameBoard.pieceAddition(rook1.startingLocation, rook1.piece);
    startGameBoard.pieceAddition(rook2.startingLocation, rook2.piece);

    startGameBoard.pieceAddition(knight1.startingLocation, knight1.piece);
    startGameBoard.pieceAddition(knight2.startingLocation, knight2.piece);

    startGameBoard.pieceAddition(Bishop1.startingLocation, Bishop1.piece);
    startGameBoard.pieceAddition(Bishop2.startingLocation, Bishop2.piece);

    startGameBoard.pieceAddition(Queen.startingLocation, Queen.piece);

    startGameBoard.pieceAddition(King.startingLocation, King.piece);

    startGameBoard.pieceAddition(Pawn1.startingLocation, Pawn1.piece);
    startGameBoard.pieceAddition(Pawn2.startingLocation, Pawn2.piece);
    startGameBoard.pieceAddition(Pawn3.startingLocation, Pawn3.piece);
    startGameBoard.pieceAddition(Pawn4.startingLocation, Pawn4.piece);
    startGameBoard.pieceAddition(Pawn5.startingLocation, Pawn5.piece);
    startGameBoard.pieceAddition(Pawn6.startingLocation, Pawn6.piece);
    startGameBoard.pieceAddition(Pawn7.startingLocation, Pawn7.piece);
    startGameBoard.pieceAddition(Pawn8.startingLocation, Pawn8.piece);

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
