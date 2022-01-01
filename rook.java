class rook extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    if ((newRow < this.row || newRow > this.row) && newColumn == this.column) {
      return true;
    } else if ((newColumn < this.column || newColumn > this.column) && newRow == this.row) {
      return true;
    } else {
      return false;
    }
  }
}
