// The class is used to define how knights work in the game.

class knight extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    // Horse moves forward and to the left.
    if ((newRow == (this.row - 2)) && newColumn == this.column - 1) {
      this.row = newRow;
      this.column = newColumn;
      
      return true;
    } // Horse moves forward and to the right.
    else if ((newRow == (this.row - 2)) && newColumn == this.column + 1) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } // Horse moves down and to the left.
    else if ((newRow == (this.row + 2)) && newColumn == this.column - 1) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } // Horse moves down and to the right.
    else if ((newRow == (this.row + 2)) && newColumn == this.column + 1) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } // Horse moves down and to the left (further left).
    else if ((newRow == (this.row + 1)) && newColumn == this.column - 2) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } // Horse moves down and to the right (further right).
    else if ((newRow == (this.row + 1)) && newColumn == this.column + 2) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } // Horse moves up and to the left (further left).
    else if ((newRow == (this.row - 1)) && newColumn == this.column - 2) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } // Horse moves up and to the right (further right).
    else if ((newRow == (this.row - 1)) && newColumn == this.column + 2) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } else {
      return false;
    }
  }
}
