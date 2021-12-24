import java.util.ArrayList;

class Board {
  ArrayList<String> ChessBoard = new ArrayList<String>();

  String emptySpace = "|_|";
  Pieces freeSpace = new Pieces();

  public BoardSetter(Pieces chessPiece) {
    if (freespace.isFree == true) {
      ChessBoard.add(emptySpace);
    } else {
      freeSpace = chessPiece;
      ChessBoard.add(freeSpace.piece);
    }
  }
}
