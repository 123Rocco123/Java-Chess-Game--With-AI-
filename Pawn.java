class Pawn extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    if ((newRow == (this.row + 1)) && (newColumn == column) && chessBoard[newRow][newColumn] == "|__|") {
      return true;
    } else if ((newRow == (this.row + 1)) && ((newColumn == column + 1) || (newColumn == column - 1)) && chessBoard[newRow][newColumn] != "|__|"){
      return true;
    } else {
      return false;
    }
  }
}
