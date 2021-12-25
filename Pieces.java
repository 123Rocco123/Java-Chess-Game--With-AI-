// The class is used to define how pawns work
class Pieces {
  int row;
  int column;
  String chessPiece;

  String[][] chessBoard;

  public void rowAssignment(int rowNow) {
    this.row = rowNow;
  }

  public void columnAssignment(int columnNow) {
    this.column = columnNow;
  }

  public void chessBoardAssignemnt(String[][] chessBoardToAssign) {
    this.chessBoard = chessBoardToAssign;
  }

  public void chessPieceLook(String chessPieceToAssign) {
    this.chessPiece = chessPieceToAssign;
  }

  public boolean allowedMoves(int newRow, int newColumn) {
    if ((newRow == (this.row + 1)) && (newColumn == column)) {
      return true;
    } else {
      return false;
    }
  }

  public void setSpace(int newRow, int newColumn) {
    this.chessBoard[newRow][newColumn] = this.chessPiece;
  }
}
