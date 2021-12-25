import java.util.Arrays;

class mainFile {
  public static void boardOutput(Board chessBoardObject) {
      for (String[] row : chessBoardObject.chessBoard) {
        System.out.println(Arrays.toString(row));
      }
  }

  public static void main(String[] args) {

    }
  }
