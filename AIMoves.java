class AIMoves {
  String[][] chessBoard;

  String[] AIPieces = {"|PA|", "|PB|", "|PC|", "|PD|", "|PE|", "|PF|", "|PG|", "|PH|",
                       "|R3|", "|R4|",
                       "|B3|", "|B4|",
                       "|K3|", "|K4|",
                       "|Q2|", "|Ki|"};

  public void chessBoardSetterFunc(String[][] boardToPLayOn) {
    this.chessBoard = boardToPLayOn;
  }

  // The function below is used to defend against the players team's chess pieces.
     // The for loops are used to iterate throughout the ches board and see which pieces are the computers and which are the player's.
  public void defendFunction() {
    for (int i = 0; i < chessBoard.length; i++) {
      for (int x = 0; x < chessBoard.length; x++) {
        for (int z = 0; z < AIPieces.length; z++) {
          if (chessBoard[i][x].equals(AIPieces[z])) {
            System.out.println(AIPieces[z]);
            System.out.println(i + " " + x);
          }
        }
      }
    }
  }
}
