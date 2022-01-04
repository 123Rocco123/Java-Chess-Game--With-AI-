class rook extends Pieces {
  // The override function below is used to set the rules on how the rook is allowed to move in the game.
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    if ((newRow < this.row || newRow > this.row) && newColumn == this.column) {
      this.row = newRow;
      this.column = newColumn;

      return true;
    } else if ((newColumn < this.column || newColumn > this.column) && newRow == this.row) {
      this.row = newRow;
      this.column = newColumn;
      
      return true;
    } else {
      return false;
    }
  }
}
