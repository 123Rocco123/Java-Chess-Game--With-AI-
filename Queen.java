class Queen extends Pieces {
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
      } // Move left and right
      else if ((newRow < this.row || newRow > this.row) && newColumn == this.column) {
        this.row = newRow;
        this.column = newColumn;

        return true;
      } // Move up and down
      else if ((newColumn < this.column || newColumn > this.column) && newRow == this.row) {
        this.row = newRow;
        this.column = newColumn;
        
        return true;
      } else {
        return false;
      }
    }
    return false;
  }
}
