class King extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    if (chessBoard[newRow][newColumn].equals("|__|")) {
      // Move Down to free space.
      if (newRow == row + 1 && newColumn == column) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          System.out.println(chessBoard[newRow][newColumn]);
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      } // Move Up to free space.
      if (newRow == row - 1 && newColumn == column) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      } // Move Right to free space.
      if (newRow == row && newColumn == column + 1) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      }  // Move Left to free space.
      if (newRow == row && newColumn == column - 1) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      } // Move Down and to the Right to free space.
      if (newRow == row + 1 && newColumn == column + 1) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      } // Move Down and to the Left to free space.
      if (newRow == row + 1 && newColumn == column - 1) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      } // Move Up and to the Left to free space.
      if (newRow == row - 1 && newColumn == column - 1) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      } // Move Up and to the Right to free space.
      if (newRow == row - 1 && newColumn == column + 1) {
        if (!(chessBoard[newRow][newColumn].equals("|__|"))) {
          return false;
        } else {
          column = newColumn;
          row = newRow;

          return true;
        }
      }
    } else {
      
    }
    return false;
  }
}
