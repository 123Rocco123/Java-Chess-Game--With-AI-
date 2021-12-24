class Pieces {
  int position;
  boolean isFree;

  public void emptySpaceCheck(boolean free) {
    this.isFree = free;
  }

  public void positionSetter(int variable) {
    this.position = variable;
  }
}
