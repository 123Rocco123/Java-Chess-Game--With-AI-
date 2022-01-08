// Bishop class used to set the rules for bishop movemenet.
   // The Bishop is missing:
      // Attack Functionality

class bishop extends Pieces {
  // The function override is used to set the function inside of the Pieces class to be specifically tailored to the bishop chess piece.
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    // The if statement is used to check if the final destination is a free spot or not.
    if (chessBoard[newRow][newColumn].equals("|__|")) {
      for (int i = 1; i <= 8; i++) {
        // Up and to the Left
        if ((newRow == this.row - i) && newColumn == this.column - i) {
          System.out.println("Up and to the left");
          // The for loop is then used to check each of the row and column combinations if they're free or not (down to the right).
          for (int x = 0; x < newRow; x++) {
            if (!(chessBoard[newRow - x][newColumn - x].equals("|__|"))) {
              return false;
            }
          }
          this.row = newRow;
          this.column = newColumn;

          return true;
        } // Down and to the Right. (FIXED)
        else if ((newRow == this.row + i) && newColumn == this.column + i) {
          System.out.println("Down and to the right");
          for (int x = 0; x < (newRow - this.row); x++) {
            System.out.println(x);
            if (!(chessBoard[newRow - x][newColumn - x].equals("|__|"))) {
              System.out.println(chessBoard[newRow-x][newColumn - x]);
              return false;
            }
          }
          this.row = newRow;
          this.column = newColumn;

          return true;
        } // Down and to the Left. (FIXED)
        else if ((newRow == this.row + i) && newColumn == this.column - i) {
          System.out.println("Down and to the left");
          for (int x = 0; x < (newRow - this.row); x++) {
            if (!(chessBoard[newRow - x][newColumn + x].equals("|__|"))) {
              System.out.println(chessBoard[newRow - x][newColumn + x]);
              return false;
            }
          }
          this.row = newRow;
          this.column = newColumn;

          return true;
        } // Up and to the Right. (FIXED)
        else if ((newRow == this.row - i) && newColumn == this.column + i) {
          System.out.println("Up and to the right");
          for (int x = 0; x < (this.row - newRow); x++) {
            if (!(chessBoard[newRow - x][newColumn + x].equals("|__|"))) {
              System.out.println(chessBoard[newRow + x][newColumn - x]);
              return false;
            }
          }
          this.row = newRow;
          this.column = newColumn;

          return true;
        }
      }
    } else {
      for (int i = 0; i < AIPieces.length; i++) {
        if (chessBoard[newRow][newColumn].equals(AIPieces[i])) {
          for (int x = 1; x <= 8; x++) {
            // Up and To he Left
            if ((newRow == row - x) && (newColumn == column - x)) {
              System.out.println("Up and Left");
              for (int z = 0; z <= 8; z++) {
                if (!(chessBoard[newRow - z][newColumn - z].equals("|__|"))) {
                  System.out.println(chessBoard[newRow - z][newColumn - x]);
                  return false;
                }
              }
              this.row = newRow;
              this.column = newColumn;

              return true;
            } // Up and to the Right.
            else if ((newRow == row - x) && (newColumn == column + x)) {
              System.out.println("Up and Right");
              for (int z = 0; z <= 8; z++) {
                if (!(chessBoard[newRow - z][newColumn + z].equals("|__|"))) {
                  System.out.println(chessBoard[newRow - z][newColumn + x]);
                  return false;
                }
              }
              this.row = newRow;
              this.column = newColumn;

              return true;
            } // Down and to the Left. (Works)
            else if ((newRow == row + x) && (newColumn == column - x)) {
              System.out.println("Down and Left");
              for (int z = 1; z < ((newRow - row) - 1); z++) {
                if (!(chessBoard[newRow - z][newColumn + z].equals("|__|"))) {
                  System.out.println(chessBoard[newRow - z][newColumn + z]);
                  return false;
                }
              }
              this.row = newRow;
              this.column = newColumn;

              return true;
            } // Down and to the Right.
            else if ((newRow == row + x) && (newColumn == column + x)) {
              System.out.println("Down and Right");
              for (int z = 0; z <= 8; z++) {
                if (!(chessBoard[newRow + z][newColumn + z].equals("|__|"))) {
                  System.out.println(chessBoard[newRow + z][newColumn + x]);
                  return false;
                }
              }
              this.row = newRow;
              this.column = newColumn;

              return true;
            }
          }
        }
      }
    }
    System.out.println("test123");
    return false;
  }
}
