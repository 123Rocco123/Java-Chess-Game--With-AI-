class rook extends Pieces {
  // The override function below is used to set the rules on how the rook is allowed to move in the game.
  // Rook Class Missing:
     // Attack Move Function

  @Override
  public boolean allowedMoves(int newRow, int newColumn) {
    for (int i = 0; i < AIPieces.length; i++) {
      if (chessBoard[newRow][newColumn].equals("|__|")) {
          // Up
          if (newColumn == column && newRow == row - i) {
            //System.out.println("Up");
            for (int x = 0; x < row - newRow; x++) {
              if (!chessBoard[newRow - x][newColumn].equals("|__|")) {
                //System.out.println(chessBoard[newRow-x][newColumn]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Down
            else if (newColumn == column && newRow == row + i) {
                //System.out.println("Down");
                for (int x = 1; x < newRow - row; x++) {
                  //System.out.println(chessBoard[row+x][newColumn]);
                  if (!chessBoard[row + x][newColumn].equals("|__|")) {
                    //System.out.println(chessBoard[row+x][newColumn]);
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
          } // Right
          else if (newColumn == this.column + i && newRow == this.row) {
            //System.out.println("Right");
            for (int y = 0; y < newColumn - this.column; y++) {
              if (!(chessBoard[newRow][newColumn - y].equals("|__|"))) {
                //System.out.println(chessBoard[newRow-y][newColumn]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          } // Left
          else if (newColumn == this.column - i && newRow == this.row) {
            //System.out.println("Left");
            for (int y = 0; y < (this.column - newColumn); y++) {
              if (!(chessBoard[newRow][newColumn + y].equals("|__|"))) {
                //System.out.println(chessBoard[newRow][newColumn + y]);
                return false;
              }
            }
            this.row = newRow;
            this.column = newColumn;

            return true;
          }
        } // The else if statement below is used when the player wants to take the other teams chess pieces
        // Down and Enemy Chess Piece.
        else if (chessBoard[newRow][newColumn].equals(AIPieces[i])) {
          for (int z = 0; z < 8; z++) {
          if (newColumn == (this.column) && newRow == (this.row + z)) {
            //System.out.println("Down Attack");
            for (int x = 1; x <= 8; x++) {
              if (newColumn == this.column && newRow == row + x) {
                for (int y = 1; y < (newRow - this.row); y++) {
                  //System.out.println(chessBoard[newRow - y][newColumn]);
                  if (!(chessBoard[newRow - y][newColumn].equals("|__|"))) {
                    return false;
                  }
                }
                this.row = newRow;
                this.column = newColumn;

                return true;
              }
            }
        } // Up and Enemy Chess Piece
        else if (newColumn == column && newRow == row - z) {
          //System.out.println("Up Attack");
          for (int x = 1; x <= 8; x++) {
            if (newColumn == this.column && newRow == row - x) {
              for (int y = 1; y < (this.row - newRow); y++) {
                //System.out.println(chessBoard[newRow + y][newColumn]);
                if (!(chessBoard[newRow + y][newColumn].equals("|__|"))) {
                  return false;
                }
              }
              this.row = newRow;
              this.column = newColumn;

              return true;
            }
          }
        } // Right Attack
        else if (newColumn == column + z && newRow == row) {
          //System.out.println("Right");
          for (int x = 1; x <= 8; x++) {
            if (newColumn == column + x && newRow == row) {
              for (int y = 1; y < newColumn - column; y++) {
                if (!(chessBoard[newRow][newColumn - y].equals("|__|"))) {
                  //System.out.println(chessBoard[newRow][newColumn -y]);
                  return false;
                }
              }
              this.row = newRow;
              this.column = newColumn;

              return true;
              }
          }
        } // Left Attack
        else if (newColumn == column - z && newRow == row) {
          //System.out.println("Right");
          for (int x = 1; x <= 8; x++) {
            if (newColumn == column - x && newRow == row) {
              for (int y = 1; y < column - newColumn; y++) {
                if (!(chessBoard[newRow][newColumn + y].equals("|__|"))) {
                  //System.out.println(chessBoard[newRow][newColumn +y]);
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
      System.out.println("test");
      return false;
    }
  }
