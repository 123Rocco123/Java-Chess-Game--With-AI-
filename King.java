class King extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    // Move up and to the right
    if ((newRow == (this.row + 1)) && (newColumn == this.column + 1)) {
      return true;
    } // Move up and to the left
    else if ((newRow == (this.row + 1)) && (newColumn == this.column - 1)) {
      return true;
    } // Move down and to the left
    else if ((newRow == (this.row - 1)) && (newColumn == this.column - 1)) {
      return true;
    } // Move down and to the right
    else if ((newRow == (this.row - 1)) && (newColumn == this.column + 1)) {
      return true;
    } // Move right
    else if (newColumn == this.column + 1 && newRow == this.row) {
      return true;
    } // Move left
    else if (newColumn == this.column - 1 && newRow == this.row) {
      return true;
    } // Move up
    else if (newRow == this.row && newColumn == this.column + 1) {
      return true;
    } // Move down
    else if (newRow == this.row && newColumn == this.column - 1) {
      return true;
    } else {
      return false;
    }
  }
}
