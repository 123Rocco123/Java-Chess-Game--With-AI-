// Java Chess Game
import java.util.ArrayList;
import java.util.Hashmap;

class chessgame {
  // The function below is used to create and print out the board.
  public static void Board() {
    ArrayList<String> chessBoard = new ArrayList<String>();

    for (int i = 0; i < 8; i++) {
      for (int x = 0; x < 8; x++) {
        chessBoard.add("|_|");
      }
    }

    for (int y = 0; y < 8; y++) {
      for (int z = 0; z < 8; z++) {
        System.out.print(chessBoard.get(z));
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) {
    Board();
  }
}
