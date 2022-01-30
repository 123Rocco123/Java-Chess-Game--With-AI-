import java.util.Arrays;
import java.util.ArrayList;

class AIMoves {
  String[][] chessBoard;

  // The Objects below are used for the player's chess pieces.
  Pawn pawn9 = new Pawn();
  Pawn pawn10 = new Pawn();
  Pawn pawn11 = new Pawn();
  Pawn pawn12 = new Pawn();
  Pawn pawn13 = new Pawn();
  Pawn pawn14 = new Pawn();
  Pawn pawn15 = new Pawn();
  Pawn pawn16 = new Pawn();

  rook rook3 = new rook();
  rook rook4 = new rook();

  knight knight3 = new knight();
  knight knight4 = new knight();

  bishop bishop3 = new bishop();
  bishop bishop4 = new bishop();

  Queen queen2 = new Queen();
  King king2 = new King();

  Pawn[] pawnObjects = {pawn9, pawn10, pawn12, pawn13, pawn14, pawn15, pawn16};
  rook[] rookObjects = {rook3, rook4};
  bishop[] bishopObjects = {bishop3, bishop4};
  knight[] knightObjects = {knight3, knight4};

  String[] AIPieces = {"|PA|", "|PB|", "|PC|", "|PD|", "|PE|", "|PF|", "|PG|", "|PH|",
                       "|R3|", "|R4|",
                       "|B3|", "|B4|",
                       "|K3|", "|K4|",
                       "|Q2|", "|Ki|"};

  String[] playerPieces = {"|P1|", "|P2|", "|P3|", "|P4|", "|P5|", "|P6|", "|P7|", "|P8|",
                           "|R1|", "|R2|",
                           "|B1|", "|B2|",
                           "|K1|", "|K2|",
                           "|Q1|", "|KI|"};

  public void rookAssignment() {
    rook3.rowAssignment(8);
    rook3.columnAssignment(1);
    rook3.chessBoardAssignemnt(chessBoard);
    rook3.chessPieceLook("|R3|");
    rook3.setSpace(rook3.row, rook3.column);

    rook4.rowAssignment(8);
    rook4.columnAssignment(8);
    rook4.chessBoardAssignemnt(chessBoard);
    rook4.chessPieceLook("|R4|");
    rook4.setSpace(rook4.row, rook4.column);
 }

 // The function below are used to assign the bishops on the chessboard.
  public void bishopAssignment() {
     bishop3.rowAssignment(8);
     bishop3.columnAssignment(2);
     bishop3.chessBoardAssignemnt(chessBoard);
     bishop3.chessPieceLook("|B3|");
     bishop3.setSpace(bishop3.row, bishop3.column);

     bishop4.rowAssignment(8);
     bishop4.columnAssignment(7);
     bishop4.chessBoardAssignemnt(chessBoard);
     bishop4.chessPieceLook("|B4|");
     bishop4.setSpace(bishop4.row, bishop4.column);
   }

   // The function is used to setup the horses on the board.
  public void knightAssignment() {
     knight3.rowAssignment(8);
     knight3.columnAssignment(3);
     knight3.chessBoardAssignemnt(chessBoard);
     knight3.chessPieceLook("|K3|");
     knight3.setSpace(knight3.row, knight3.column);

     knight4.rowAssignment(8);
     knight4.columnAssignment(6);
     knight4.chessBoardAssignemnt(chessBoard);
     knight4.chessPieceLook("|K4|");
     knight4.setSpace(knight4.row, knight4.column);
   }

 // The function is used to setup the queen on the board.
  public void queenAssignment() {
     // AI Team Assignment

     queen2.rowAssignment(8);
     queen2.columnAssignment(4);
     queen2.chessBoardAssignemnt(chessBoard);
     queen2.chessPieceLook("|Q2|");
     queen2.setSpace(queen2.row, queen2.column);
 }

 // The function is used to setup the king on the board.
  public void kingAssignment() {
     // AI Team Assignment
     king2.rowAssignment(8);
     king2.columnAssignment(5);
     king2.chessBoardAssignemnt(chessBoard);
     king2.chessPieceLook("|Ki|");
     king2.setSpace(king2.row, king2.column);
 }

 // The function below is used to store the assignment of the pawns.
    // This is the inital setup function.
  public void pawnAssignment() {
    pawn9.rowAssignment(7);
    pawn9.columnAssignment(1);
    pawn9.chessBoardAssignemnt(chessBoard);
    pawn9.chessPieceLook("|PA|");
    pawn9.setSpace(pawn9.row, pawn9.column);

    pawn10.rowAssignment(7);
    pawn10.columnAssignment(2);
    pawn10.chessBoardAssignemnt(chessBoard);
    pawn10.chessPieceLook("|PB|");
    pawn10.setSpace(pawn10.row, pawn10.column);
    /*
    pawn11.rowAssignment(7);
    pawn11.columnAssignment(3);
    pawn11.chessBoardAssignemnt(chessBoard);
    pawn11.chessPieceLook("|PC|");
    pawn11.setSpace(pawn11.row, pawn11.column);
*/
    pawn12.rowAssignment(7);
    pawn12.columnAssignment(4);
    pawn12.chessBoardAssignemnt(chessBoard);
    pawn12.chessPieceLook("|PD|");
    pawn12.setSpace(pawn12.row, pawn12.column);

    pawn13.rowAssignment(7);
    pawn13.columnAssignment(5);
    pawn13.chessBoardAssignemnt(chessBoard);
    pawn13.chessPieceLook("|PE|");
    pawn13.setSpace(pawn13.row, pawn13.column);

    pawn14.rowAssignment(7);
    pawn14.columnAssignment(6);
    pawn14.chessBoardAssignemnt(chessBoard);
    pawn14.chessPieceLook("|PF|");
    pawn14.setSpace(pawn14.row, pawn14.column);

    pawn15.rowAssignment(7);
    pawn15.columnAssignment(7);
    pawn15.chessBoardAssignemnt(chessBoard);
    pawn15.chessPieceLook("|PG|");
    pawn15.setSpace(pawn15.row, pawn15.column);

    pawn16.rowAssignment(7);
    pawn16.columnAssignment(8);
    pawn16.chessBoardAssignemnt(chessBoard);
    pawn16.chessPieceLook("|PH|");
    pawn16.setSpace(pawn16.row, pawn16.column);
 }

  // Set the chessBoard to the one that the player plays on.
  public void chessBoardSetterFunc(String[][] boardToPLayOn) {
    this.chessBoard = boardToPLayOn;

    rookAssignment();
    bishopAssignment();
    knightAssignment();
    queenAssignment();
    kingAssignment();
    pawnAssignment();
  }

  // Used in case there is no other better move
     // It simply moves one of the pieces forward.
  public void defaultMove() {
    for (int i = 0; i < AIPieces.length; i++) {
      // Pawns
      if (i <= 7) {
        for (int x = 0; x < pawnObjects.length; x++) {
          if (pawnObjects[x].allowedMovesAI(pawnObjects[x].row - 1, pawnObjects[x].column) == true) {
            chessBoard[pawnObjects[x].row][pawnObjects[x].column] = pawnObjects[x].chessPiece;
            chessBoard[pawnObjects[x].row + 1][pawnObjects[x].column] = "|__|";
            return;
          }
        }
      }
    }
  }

  // The function is used to check all of the AI chess pieces and sees which of them will have the shortest path to taking the piece that the player just moved.
  public boolean attackMove() {
    for (int i = 0; i < AIPieces.length; i++) {
      // AI for Pawns
      if (i <= 7) {
        for (int x = 0; x < pawnObjects.length; x++) {
          //System.out.println(x);
          if (pawnObjects[x].allowedMovesAI(pawnObjects[x].row - 1, pawnObjects[x].column - 1) == true) {
            chessBoard[pawnObjects[x].row][pawnObjects[x].column] = pawnObjects[x].chessPiece;
            chessBoard[pawnObjects[x].row + 1][pawnObjects[x].column + 1] = "|__|";
            //System.out.println("true");
            return true;
          } else if ((pawnObjects[x].column + 1 < 9) && pawnObjects[x].allowedMovesAI(pawnObjects[x].row - 1, pawnObjects[x].column + 1) == true) {
            chessBoard[pawnObjects[x].row][pawnObjects[x].column] = pawnObjects[x].chessPiece;
            chessBoard[pawnObjects[x].row + 1][pawnObjects[x].column - 1] = "|__|";
            return true;
          }
        }
      } // AI for Rooks
      else if (i == 8 || i == 9) {
        for (int x = 0; x < rookObjects.length; x++) {
          for (int y = 1; y <= 7; y++) {
            // Possible attack up
            if (rookObjects[x].row - y > 0 && rookObjects[x].allowedMovesAI(rookObjects[x].row - y, rookObjects[x].column) == true) {
              //System.out.println("up");
              chessBoard[rookObjects[x].row][rookObjects[x].column] = rookObjects[x].chessPiece;
              chessBoard[rookObjects[x].row + y][rookObjects[x].column] = "|__|";
              return true;
            } // Possible attack down
            else if (rookObjects[x].row + y < 9 && rookObjects[x].allowedMovesAI(rookObjects[x].row + y, rookObjects[x].column) == true) {
              //System.out.println("down");
              chessBoard[rookObjects[x].row][rookObjects[x].column] = rookObjects[x].chessPiece;
              chessBoard[rookObjects[x].row - y][rookObjects[x].column] = "|__|";
              return true;
            } // Possible attack left
            else if (rookObjects[x].column - y > 0 && rookObjects[x].allowedMovesAI(rookObjects[x].row, rookObjects[x].column - y) == true) {
              //System.out.println("left");
              chessBoard[rookObjects[x].row][rookObjects[x].column] = rookObjects[x].chessPiece;
              chessBoard[rookObjects[x].row][rookObjects[x].column + y] = "|__|";
              return true;
            } // Possible attack right
            else if (rookObjects[x].column + y < 9 && rookObjects[x].allowedMovesAI(rookObjects[x].row, rookObjects[x].column + y) == true) {
              //System.out.println("right");
              chessBoard[rookObjects[x].row][rookObjects[x].column] = rookObjects[x].chessPiece;
              chessBoard[rookObjects[x].row][rookObjects[x].column - y] = "|__|";
              return true;
            }
          }
        }
      } // AI for Bishops
      else if (i == 10 || i == 11) {
        for (int x = 0; x < bishopObjects.length; x++) {
          for (int y = 1; y <= 7; y++) {
            // Bishop Attack to Top Left
            if (bishopObjects[x].row - y > 0 && bishopObjects[x].column - y > 0 && bishopObjects[x].allowedMovesAI(bishopObjects[x].row - y, bishopObjects[x].column - y) == true) {
              chessBoard[bishopObjects[x].row][bishopObjects[x].column] = bishopObjects[x].chessPiece;
              chessBoard[bishopObjects[x].row + y][bishopObjects[x].column + y] = "|__|";
              return true;
            } // Bishop Attack to Top Right
            else if (bishopObjects[x].row - y > 0 && ((bishopObjects[x].column + y) < 9) && bishopObjects[x].allowedMovesAI(bishopObjects[x].row - y, bishopObjects[x].column + y) == true) {
              chessBoard[bishopObjects[x].row][bishopObjects[x].column] = bishopObjects[x].chessPiece;
              chessBoard[bishopObjects[x].row + y][bishopObjects[x].column - y] = "|__|";
              return true;
            } // Bishop Attack to Bottom Right
            else if (bishopObjects[x].row + y < 9 && bishopObjects[x].column - y > 0 && bishopObjects[x].allowedMovesAI(bishopObjects[x].row + y, bishopObjects[x].column - y) == true) {
              chessBoard[bishopObjects[x].row][bishopObjects[x].column] = bishopObjects[x].chessPiece;
              chessBoard[bishopObjects[x].row - y][bishopObjects[x].column + y] = "|__|";
              return true;
            } // Bishop Attack to Bottom Left
            else if (bishopObjects[x].row + y < 9 && bishopObjects[x].column + y < 9 && bishopObjects[x].allowedMovesAI(bishopObjects[x].row + y, bishopObjects[x].column + y) == true) {
              chessBoard[bishopObjects[x].row][bishopObjects[x].column] = bishopObjects[x].chessPiece;
              chessBoard[bishopObjects[x].row - y][bishopObjects[x].column - y] = "|__|";
              return true;
            }
          }
        }
      } // AI for Knights
      else if (i == 12 || i == 13) {
        for (int x = 0; x < knightObjects.length; x++) {
          // Attack Up and to the Right
          if (knightObjects[x].allowedMovesAI(knightObjects[x].row - 2 && knightObjects[x].column + 1)) {

          }
        }
      }
    }
    return false;
  }

  // The function below is used to defend against the players team's chess pieces.
     // The for loops are used to iterate throughout the ches board and see which pieces are the computers and which are the player's.
  public String[][] defendFunction(int movedRow, int movedColumn) {
    if (attackMove() == true) {
      return chessBoard;
    } else {
      defaultMove();
      return chessBoard;
    }
  }
}
