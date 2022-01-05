class rook extends Pieces {
  // The override function below is used to set the rules on how the rook is allowed to move in the game.
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    //System.out.println(this.row);
    //System.out.println(this.column);

    for (int i = 0; i < AIPieces.length; i++) {
      if (chessBoard[newRow][newColumn].equals("|__|") || chessBoard[newRow][newColumn].equals(AIPieces[i])) {
          // Up
          if (newColumn == column && newRow == row - i) {
            //System.out.println("Up");
            for (int x = 0; x < row - newRow; x++) {
              if (!chessBoard[newRow - x][newColumn].equals("|__|")) {
                //System.out.println(chessBoard[newRow-x][newColumn]);
                return false;
              }
            }
            return true;
          } // Down
          else if (newColumn == column && newRow == row + i) {
            //System.out.println("Down");
            for (int y = 0; y < newRow - this.row; y++) {
              if (!(chessBoard[newRow - y][newColumn].equals("|__|")) && !(chessBoard[newRow - y][newColumn - y].equals(chessPiece))) {
                //System.out.println(chessBoard[newRow-y][newColumn]);
                return false;
              }
            }
            //System.out.println(newRow);
            //System.out.println(newColumn);
            return true;
          }
        }
      }
      System.out.println("test");
      return false;
    }
  }
