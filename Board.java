import java.util.ArrayList;

class Board {
  ArrayList<String> ChessBoard = new ArrayList<String>();

  String emptySpace = "|__|";
  Pieces freeSpace = new Pieces();

  public void BoardSetter() {
    for (int i = 0; i < 64; i++) {
      ChessBoard.add(emptySpace);
    }
  }

  public void pieceAddition(int indexPosition, String pieceToAdd) {
    ChessBoard.set(indexPosition, pieceToAdd);
  }
}
