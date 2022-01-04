// Bishop class used to set the rules for bishop movemenet.

class bishop extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    // The for loop contains the code which is used to move from one space to an empty space.
    for (int i = 1; i < 9; i++) {
      for (int x = 0; x < AIPieces.length; x++) {
      if (this.chessBoard[newRow][newColumn].equals("|__|") || this.chessBoard[newRow][newColumn].equals(AIPieces[x])) {
        // Move up and to the right
        if ((newRow == (this.row + i)) && (newColumn == this.column + i)) {
          this.row = newRow;
          this.column = newColumn;

          return true;
        } // Move up and to the left
        else if ((newRow == (this.row + i)) && (newColumn == this.column - i)) {
          this.row = newRow;
          this.column = newColumn;

          return true;
        } // Move down and to the left
        else if ((newRow == (this.row - i)) && (newColumn == this.column - i)) {
          this.row = newRow;
          this.column = newColumn;

          return true;
        } // Move down and to the right
        else if ((newRow == (this.row - i)) && (newColumn == this.column + i)) {
          this.row = newRow;
          this.column = newColumn;

          return true;
        } else if (!(this.chessBoard[(this.row + i)][this.column + i].equals("|__|"))) {
          return false;
        }
      }
    }
    }
    return false;
  }
}
