import java.util.Arrays;

class mainFile {
  public static void main(String[] args) {
    Board test = new Board();
    test.chessBoardSetter(0, 0, "test");

      for (String[] row : test.chessBoard) {
        System.out.println(Arrays.toString(row));
      }
    }
  }
