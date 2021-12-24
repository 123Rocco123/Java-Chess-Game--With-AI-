class Pieces {
  boolean isFree = false;

  int startingLocation;
  String piece;

  public void positionSetter(int start, String chessPiece) {
    this.startingLocation = start;
    this.piece = chessPiece;
  }
}
