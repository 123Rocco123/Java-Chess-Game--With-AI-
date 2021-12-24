import java.util.ArrayList;

class Board {
  // The ArrayList below is used to contain the chessboard that the players are playing on. 
  ArrayList<String> ChessBoard = new ArrayList<String>();

  // The instance variables below are used to contain an empty spot, and an object of the "Pieces" class.
  String emptySpace = "|__|";
  Pieces freeSpace = new Pieces();

  // The function below is used to create a completely empty board.
  public void BoardSetter() {
    for (int i = 0; i < 64; i++) {
      ChessBoard.add(emptySpace);
    }
  }

  // The function below is used with the BoardSetter function, where it changes the empty spots to the ones containing pieces.
  public void pieceAddition(int indexPosition, String pieceToAdd) {
    ChessBoard.set(indexPosition, pieceToAdd);
  }
}
