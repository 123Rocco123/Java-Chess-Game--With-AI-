class AIMoves {
  String[][] chessBoard;

  public void chessBoardSetterFunc(String[][] boardToPLayOn) {
    this.chessBoard = boardToPLayOn;
  }

  // The function below is used to defend against the players team's chess pieces.
     // The for loops are used to iterate throughout the ches board and see which pieces are the computers and which are the player's.
  public void defendFunction() {
    for (int i = 0; i < chessBoard.length; i++) {
      for (int x = 0; x < chessBoard.length; x++) {
        System.out.println(chessBoard[i][x]);
      }
    }
  }
}
