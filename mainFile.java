import java.util.Arrays;
import java.util.ArrayList;

class mainFile {
  Board BoardToPlayOn = new Board();

  // The boardOutput function is to just output the chess board to the player.
  public void boardOutput() {
      for (String[] row : BoardToPlayOn.chessBoard) {
        System.out.println(Arrays.toString(row));
      }
  }

  // This function is used to assign the rooks to the chessboard.
     // This is the inital setup function.
  public void rookAssignment() {
    rook rook1 = new rook();
    rook rook2 = new rook();

    rook1.rowAssignment(1);
    rook1.columnAssignment(1);
    rook1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    rook1.chessPieceLook("|R1|");
    rook1.setSpace(rook1.row, rook1.column);

    rook2.rowAssignment(1);
    rook2.columnAssignment(8);
    rook2.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    rook2.chessPieceLook("|R2|");
    rook2.setSpace(rook2.row, rook2.column);
  }

  // The function below is used to store the assignment of the pawns.
     // This is the inital setup function. 
  public void pawnAssignment() {
    Pawn pawn1 = new Pawn();
    Pawn pawn2 = new Pawn();
    Pawn pawn3 = new Pawn();
    Pawn pawn4 = new Pawn();
    Pawn pawn5 = new Pawn();
    Pawn pawn6 = new Pawn();
    Pawn pawn7 = new Pawn();
    Pawn pawn8 = new Pawn();

    pawn1.rowAssignment(2);
    pawn1.columnAssignment(1);
    pawn1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn1.chessPieceLook("|P1|");
    pawn1.setSpace(pawn1.row, pawn1.column);

    pawn2.rowAssignment(2);
    pawn2.columnAssignment(2);
    pawn2.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn2.chessPieceLook("|P2|");
    pawn2.setSpace(pawn2.row, pawn2.column);

    pawn3.rowAssignment(2);
    pawn3.columnAssignment(3);
    pawn3.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn3.chessPieceLook("|P3|");
    pawn3.setSpace(pawn3.row, pawn3.column);

    pawn4.rowAssignment(2);
    pawn4.columnAssignment(4);
    pawn4.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn4.chessPieceLook("|P4|");
    pawn4.setSpace(pawn4.row, pawn4.column);

    pawn5.rowAssignment(2);
    pawn5.columnAssignment(5);
    pawn5.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn5.chessPieceLook("|P5|");
    pawn5.setSpace(pawn5.row, pawn5.column);

    pawn6.rowAssignment(2);
    pawn6.columnAssignment(6);
    pawn6.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn6.chessPieceLook("|P6|");
    pawn6.setSpace(pawn6.row, pawn6.column);

    pawn7.rowAssignment(2);
    pawn7.columnAssignment(7);
    pawn7.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn7.chessPieceLook("|P7|");
    pawn7.setSpace(pawn7.row, pawn7.column);

    pawn8.rowAssignment(2);
    pawn8.columnAssignment(8);
    pawn8.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn8.chessPieceLook("|P8|");
    pawn8.setSpace(pawn8.row, pawn8.column);
  }

  public static void main(String[] args) {
    mainFile start = new mainFile();
    start.pawnAssignment();
    start.rookAssignment();

    start.boardOutput();
  }
}
