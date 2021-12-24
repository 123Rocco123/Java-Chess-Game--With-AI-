class Pieces {
  // The instance variables below are used to store the location of the piece, and the piece itself.
  int startingLocation;
  String piece;

  // The instance variable below is used to show that the piece is part of the player's team.
  boolean playerTeam = true;

  // The function below is used to assign values to the instance variables above.
  public void positionSetter(int start, String chessPiece) {
    this.startingLocation = start;
    this.piece = chessPiece;
  }

  // The function below is used to re-assign the value inside of the
  public void computerTeam() {
    this.playerTeam = false;
  }
}
