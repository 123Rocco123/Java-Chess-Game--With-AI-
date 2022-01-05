class rook extends Pieces {
  // The override function below is used to set the rules on how the rook is allowed to move in the game.
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    for (int i = 0; i < AIPieces.length; i++) {
      if (chessBoard[newRow][newColumn].equals("|__|") || chessBoard[newRow][newColumn].equals(AIPieces[i])) {
        
      }
    }
  }
}
