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
      for (int i = 0; i < AIPieces.length; i++) {
        if (chessBoard[newRow][newColumn].equals(AIPieces[i])) {
          // Attack move down
          if (newRow == row + 1 && newColumn == column) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Up
          else if (newRow == row - 1 && newColumn == column) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Right
          else if (newRow == row && newColumn == column + 1) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Left
          else if (newRow == row && newColumn == column - 1) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Up Right
          else if (newRow == row - 1 && newColumn == column + 1) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Up Left
          else if (newRow == row - 1 && newColumn == column - 1) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Down Left
          else if (newRow == row + 1 && newColumn == column - 1) {
            column = newColumn;
            row = newRow;

            return true;
          } // Attack Down Right
          else if (newRow == row + 1 && newColumn == column + 1) {
            column = newColumn;
            row = newRow;

            return true;
          }
        }
      }
      return false;
    }
    return false;
  }
}
