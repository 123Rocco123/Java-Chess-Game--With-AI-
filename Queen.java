class Queen extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    for (int i = 1; i <= 8; i++) {
      // Move to a free space
      if (chessBoard[newRow][newColumn].equals("|__|")) {

      } else {
        // The for loop is used to iterate throughout all of the
        for (int x = 0; x < AIPieces.length; x++) {
          if (chessBoard[newRow][newColumn].equals(AIPieces[x])) {
            
          }
        }
      }
    return false;
  }
}
