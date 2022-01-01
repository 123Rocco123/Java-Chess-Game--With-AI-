// The class is used to define how pawns work
class Pieces {
  int row;
  int column;
  String chessPiece;

  String[][] chessBoard;

  // The function is used to assign the rows to the chessboard, by changing the instance variable in the class.
  public void rowAssignment(int rowNow) {
    this.row = rowNow;
  }

  // The function is used to assign the columns to the chessboard, by changing the instance variable in the class.
  public void columnAssignment(int columnNow) {
    this.column = columnNow;
  }

  // The function is used to assign the array containing the chessboard, by changing the instance variable in the class.
  public void chessBoardAssignemnt(String[][] chessBoardToAssign) {
    this.chessBoard = chessBoardToAssign;
  }

  // The function is used to assign the chess piece to the chessboard, by changing the instance variable in the class.
  public void chessPieceLook(String chessPieceToAssign) {
    this.chessPiece = chessPieceToAssign;
  }

  // The function is used as a skeleton structure for the allowed moves that the chess pieces are able to do.
     // The returned value of the function is then used to see if the move that the uesr inputted is valid or not.
  public boolean allowedMoves(int newRow, int newColumn) {
    if ((newRow == (this.row + 1)) && (newColumn == column)) {
      return true;
    } else {
      return false;
    }
  }

  // The function below is used to re-assign the value in the Array[][] with the piece using the instance variables in the class.
  public void setSpace(int newRow, int newColumn) {
    this.chessBoard[newRow][newColumn] = this.chessPiece;
  }

  public String pieceReturn() {
    return this.chessPiece;
  }
}
