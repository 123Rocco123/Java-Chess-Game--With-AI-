import java.util.Arrays;
import java.util.ArrayList;

class mainFile {
  Board BoardToPlayOn = new Board();

  public void boardOutput() {
      for (String[] row : BoardToPlayOn.chessBoard) {
        System.out.println(Arrays.toString(row));
      }
  }

  public void pawnAssignment(Object mainFileObject) {
    Pawn pawn1 = new Pawn();
    Pawn pawn2 = new Pawn();
    Pawn pawn3 = new Pawn();
    Pawn pawn4 = new Pawn();
    Pawn pawn5 = new Pawn();
    Pawn pawn6 = new Pawn();
    Pawn pawn7 = new Pawn();
    Pawn pawn8 = new Pawn();

    pawn1.rowAssignment(1);
    pawn1.columnAssignment(1);
    pawn1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn1.chessPieceLook("|P1|");
    pawn1.setSpace(pawn1.row, pawn1.column);

    boardOutput();
  }

  public static void main(String[] args) {
    mainFile start = new mainFile();
    start.pawnAssignment(start);
  }
}
