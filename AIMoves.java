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

  Pawn[] pawnObjects = {pawn9, pawn10, pawn11, pawn12, pawn13, pawn14, pawn15, pawn16};

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

    pawn11.rowAssignment(7);
    pawn11.columnAssignment(3);
    pawn11.chessBoardAssignemnt(chessBoard);
    pawn11.chessPieceLook("|PC|");
    pawn11.setSpace(pawn11.row, pawn11.column);

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

  // The function below is used to defend against the players team's chess pieces.
     // The for loops are used to iterate throughout the ches board and see which pieces are the computers and which are the player's.
  public String[][] defendFunction(int movedRow, int movedColumn) {
    // Used if no other move is possible / sensible.
    boolean lastResort = false;

    // The for loop is used to iterate throughout the entire chessBoard.
    for (int i = 0; i < chessBoard.length; i++) {
      for (int x = 0; x < chessBoard.length; x++) {
        // The second set of for loops below is used to iterate through the AIPieces to see which spot contains one of the AI's chess pieces.
        for (int z = 0; z < AIPieces.length; z++) {
          if (chessBoard[i][x].equals(AIPieces[z])) {
            // The if statement below is used to check if the piece's is a pawn or not.
            if (z <= 7) {
              // Used to attack enemy pieces on the right with the pawn.
              if (pawnObjects[z].allowedMovesAI(((pawnObjects[z]).row - 1), (pawnObjects[z]).column + 1) == true) {
                //System.out.println("Pawn Attack on the Right");
                chessBoard[(pawnObjects[z]).row][(pawnObjects[z]).column] = (pawnObjects[z]).chessPiece;
                chessBoard[pawnObjects[z].row + 1][pawnObjects[z].column - 1] = "|__|";

                return chessBoard;
                // Used to attack enemy pieces on the left with the pawn.
              } else if (pawnObjects[z].allowedMovesAI(((pawnObjects[z]).row - 1), (pawnObjects[z]).column - 1) == true) {
                //System.out.println("Pawn Attack on the Left");
                chessBoard[pawnObjects[z].row][pawnObjects[z].column] = pawnObjects[z].chessPiece;
                chessBoard[pawnObjects[z].row + 1][pawnObjects[z].column + 1] = "|__|";

                return chessBoard;
              } // Move Up on the left of the pawn that the player just moved.
              else if ((pawnObjects[z].allowedMovesAI(((pawnObjects[z]).row - 1), movedColumn - 1) == true) && lastResort == true) {
                //System.out.println("Move up on the left");
                chessBoard[pawnObjects[z].row][pawnObjects[z].column] = pawnObjects[z].chessPiece;
                chessBoard[pawnObjects[z].row + 1][pawnObjects[z].column] = "|__|";

                return chessBoard;
              } // Move Up on the right of the pawn that the player just moved.
              else if ((pawnObjects[z].allowedMovesAI(((pawnObjects[z]).row - 1), movedColumn + 1) == true) && lastResort == true) {
                //System.out.println("Move Up on the Right");
                chessBoard[pawnObjects[z].row][pawnObjects[z].column] = pawnObjects[z].chessPiece;
                chessBoard[pawnObjects[z].row + 1][pawnObjects[z].column] = "|__|";

                return chessBoard;
              }
            } else if (z == 8 || z == 9) {
              
            }
          }
        }
      }
    }
    return chessBoard;
  }
}
