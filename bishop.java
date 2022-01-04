// Bishop class used to set the rules for bishop movemenet.

class bishop extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    for (int i = 1; i < 9; i++) {
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
      }
    }
    return false;
  }
}
