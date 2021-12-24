class Pieces {
  // The instance variables below are used to store the location of the piece, and the piece itself.
  int startingLocation;
  String piece;

  // The function below is used to assign values to the instance variables above. 
  public void positionSetter(int start, String chessPiece) {
    this.startingLocation = start;
    this.piece = chessPiece;
  }
}
