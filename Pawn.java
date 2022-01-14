class Pawn extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
      if ((newRow == (this.row + 1)) && (newColumn == column) && (chessBoard[newRow][newColumn]).equals("|__|")) {
        this.row = newRow;
        this.column = newColumn;

        return true;
      } else {
        for (int i = 0; i < AIPieces.length; i++) {
          // The else if statement below is used to take out the other teams pieces, if they're on the right.
          if (this.chessBoard[newRow][newColumn].equals(AIPieces[i])) {
            if ((newRow == (this.row + 1)) && (newColumn == column + 1)) {
              this.row = newRow;
              this.column = newColumn;

              return true;
            } // The else if statement below is used to take out the other teams pieces, if they're located on the left.
            else if ((newRow == (this.row + 1)) && (newColumn == column - 1)) {
              this.row = newRow;
              this.column = newColumn;

              return true;
            }
          }
        }
      }
    return false;
  }

  public boolean allowedMovesAI(int newRow, int newColumn) {
      if ((newRow == (this.row - 1)) && (newColumn == column) && (chessBoard[newRow][newColumn]).equals("|__|")) {
        this.row = newRow;
        this.column = newColumn;

        return true;
      } else {
        for (int i = 0; i < AIPieces.length; i++) {
          // The else if statement below is used to take out the other teams pieces, if they're on the right.
          if (this.chessBoard[newRow][newColumn].equals(AIPieces[i])) {
            if ((newRow == (this.row - 1)) && (newColumn == column + 1)) {
              this.row = newRow;
              this.column = newColumn;

              return true;
            } // The else if statement below is used to take out the other teams pieces, if they're located on the left.
            else if ((newRow == (this.row - 1)) && (newColumn == column - 1)) {
              this.row = newRow;
              this.column = newColumn;

              return true;
            }
          }
        }
      }
    return false;
  }
}
