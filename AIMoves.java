import java.util.ArrayList;

class AIMoves {
  // The ArrayList contains the pawn objects.
  ArrayList<Pawn> pawnObjects = new ArrayList<Pawn>();

  String[][] chessBoard;

  Pawn pawn9 = new Pawn();
  Pawn pawn10 = new Pawn();
  Pawn pawn11 = new Pawn();
  Pawn pawn12 = new Pawn();
  Pawn pawn13 = new Pawn();
  Pawn pawn14 = new Pawn();
  Pawn pawn15 = new Pawn();
  Pawn pawn16 = new Pawn();

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

  // Set the chessBoard to the one that the player plays on.
  public void chessBoardSetterFunc(String[][] boardToPLayOn) {
    this.chessBoard = boardToPLayOn;
  }

  // This re-assigns the values of the instnace variables to the ones that were defined in the main class.
  public void objectPawnSetter(Pawn pawn, Pawn pawn2, Pawn pawn3, Pawn pawn4, Pawn pawn5, Pawn pawn6, Pawn pawn7, Pawn pawn8) {
    this.pawn9 = pawn;
    this.pawn10 = pawn2;
    this.pawn11 = pawn3;
    this.pawn12 = pawn4;
    this.pawn13 = pawn5;
    this.pawn14 = pawn6;
    this.pawn15 = pawn7;
    this.pawn16 = pawn8;

    pawnObjects.add(pawn9);
    pawnObjects.add(pawn10);
    pawnObjects.add(pawn11);
    pawnObjects.add(pawn12);
    pawnObjects.add(pawn13);
    pawnObjects.add(pawn14);
    pawnObjects.add(pawn15);
    pawnObjects.add(pawn16);
  }

  public void pawnObjectTest(Pawn ObjectName) {
    System.out.println(ObjectName.chessPiece);
  }

  // The function below is used to defend against the players team's chess pieces.
     // The for loops are used to iterate throughout the ches board and see which pieces are the computers and which are the player's.
  public void defendFunction() {
    // The for loop is used to iterate throughout the entire chessBoard.
    for (int i = 0; i < chessBoard.length; i++) {
      for (int x = 0; x < chessBoard.length; x++) {
        // The second set of for loops below is used to iterate through the AIPieces to see which spot contains one of the AI's chess pieces.
        for (int z = 0; z < AIPieces.length; z++) {
          if (chessBoard[i][x].equals(AIPieces[z])) {
            // The if statement below is used to check if the piece's is a pawn or not. 
            if (z <= 7) {
              pawnObjectTest(pawnObjects.get(z));
            }
          }
        }
      }
    }
  }
}
