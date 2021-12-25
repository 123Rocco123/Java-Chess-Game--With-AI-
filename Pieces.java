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

  public void freeSpace(int newRow, int newColumn) {
    if (this.chessBoard[newRow][newColumn] == "|__|") {
      this.chessBoard[newRow][newColumn] = chessPiece;
      this.chessBoard[rowNow][columnNow] = "|__|";

      this.row = newRow;
      this.column = newColumn;
    } else {
      System.out.println("Invalid move\n");
    }
  }
}
