class Queen extends Pieces {
  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    for (int i = 1; i <= 8; i++) {
      // Move to a free space (Works)
      if (chessBoard[newRow][newColumn].equals("|__|")) {
        for (int x = 0; x <= 8; x++) {
          // If the move is down.
          if (newRow == row + x && newColumn == column) {
            for (int z = 1; z < (newRow - row); z++) {
              if (!(chessBoard[newRow - z][column].equals("|__|"))) {
                System.out.println(chessBoard[newRow - z][column]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move up to a free space. (Works)
          else if (newRow == row - x && newColumn == column) {
            for (int z = 1; z < (row - newRow); z++) {
              if (!(chessBoard[newRow + z][column].equals("|__|"))) {
                System.out.println(chessBoard[newRow + z][column]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move left to a free space. (Works)
          else if (newRow == row && newColumn == column - x) {
            for (int z = 1; z < (column - newColumn); z++) {
              if (!(chessBoard[newRow][newColumn + z].equals("|__|"))) {
                System.out.println(chessBoard[newRow][newColumn + z]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move right to a free space. (Works)
          else if (newRow == row && newColumn == column + x) {
            for (int z = 1; z < (newColumn - column); z++) {
              if (!(chessBoard[newRow][newColumn - z].equals("|__|"))) {
                System.out.println(chessBoard[newRow][newColumn - z]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move right and up to a free space. (Works)
          else if (newRow == row - x && newColumn == column + x) {
            for (int z = 1; z < (row - newRow); z++) {
              if (!(chessBoard[newRow + z][newColumn - z].equals("|__|"))) {
                System.out.println(chessBoard[newRow + z][newColumn - z]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move left and up to a free space. (Works)
          else if (newRow == row - x && newColumn == column - x) {
            for (int z = 1; z < (row - newRow); z++) {
              if (!(chessBoard[newRow + z][newColumn + z].equals("|__|"))) {
                System.out.println(chessBoard[newRow + z][newColumn + z]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move down and right to a free space. (Works)
          else if (newRow == row + x && newColumn == column + x) {
            for (int z = 1; z < (newRow - row); z++) {
              if (!(chessBoard[newRow - z][newColumn - z].equals("|__|"))) {
                System.out.println(chessBoard[newRow - z][newColumn - z]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Move down and left to a free space. (Works)
          else if (newRow == row + x && newColumn == column - x) {
            for (int z = 1; z < (newRow - row); z++) {
              if (!(chessBoard[newRow - z][newColumn + z].equals("|__|"))) {
                System.out.println(chessBoard[newRow - z][newColumn + z]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          }
        }
      } else {
        // The for loop is used to iterate throughout all of the pieces in the AIPieces array.
        for (int x = 0; x < AIPieces.length; x++) {
          // The if statement is used to check if the location that the user inputted is in fact a location with the enemy team's chess piece.
          if (chessBoard[newRow][newColumn].equals(AIPieces[x])) {
            for (int b = 0; b <= 8; b++) {
              // Move down to an attack space. (Works).
              if (newRow == row + b && newColumn == column) {
                for (int z = 1; z < (newRow - row); z++) {
                  if (!(chessBoard[newRow - z][column].equals("|__|"))) {
                    System.out.println(chessBoard[newRow - z][column]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move up to a attack space. (Works)
              else if (newRow == row - b && newColumn == column) {
                for (int z = 1; z < (row - newRow); z++) {
                  if (!(chessBoard[newRow + z][column].equals("|__|"))) {
                    System.out.println(chessBoard[newRow + z][column]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move left to a attack space. (Works)
              else if (newRow == row && newColumn == column - b) {
                for (int z = 1; z < (column - newColumn); z++) {
                  if (!(chessBoard[newRow][newColumn + z].equals("|__|"))) {
                    System.out.println(chessBoard[newRow][newColumn + z]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move right to a attack space. (Works)
              else if (newRow == row && newColumn == column + b) {
                for (int z = 1; z < (newColumn - column); z++) {
                  if (!(chessBoard[newRow][newColumn - z].equals("|__|"))) {
                    System.out.println(chessBoard[newRow][newColumn - z]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move right and up to a attack space. (Works)
              else if (newRow == row - b && newColumn == column + b) {
                for (int z = 1; z < (row - newRow); z++) {
                  if (!(chessBoard[newRow + z][newColumn - z].equals("|__|"))) {
                    System.out.println(chessBoard[newRow + z][newColumn - z]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move left and up to a attack space. (Works)
              else if (newRow == row - b && newColumn == column - b) {
                for (int z = 1; z < (row - newRow); z++) {
                  if (!(chessBoard[newRow + z][newColumn + z].equals("|__|"))) {
                    System.out.println(chessBoard[newRow + z][newColumn + z]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move down and right to a attack space. (Works)
              else if (newRow == row + b && newColumn == column + b) {
                for (int z = 1; z < (newRow - row); z++) {
                  if (!(chessBoard[newRow - z][newColumn - z].equals("|__|"))) {
                    System.out.println(chessBoard[newRow - z][newColumn - z]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              } // Move down and left to a attack space. (Works)
              else if (newRow == row + b && newColumn == column - b) {
                for (int z = 1; z < (newRow - row); z++) {
                  if (!(chessBoard[newRow - z][newColumn + z].equals("|__|"))) {
                    System.out.println(chessBoard[newRow - z][newColumn + z]);
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
    }
    return false;
  }
}
