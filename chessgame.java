// Java Chess Game
import java.util.ArrayList;
import java.util.HashMap;

class chessgame {
  // The function below is used to store the location of each of the player pieces.
  public static HashMap<String, Integer> playerPieces() {
    HashMap<String, Integer> playerPiecesLocations = new HashMap<String, Integer>();

    // Starting Positions of the Player
    playerPiecesLocations.put("T1", 56);
    playerPiecesLocations.put("H1", 57);
    playerPiecesLocations.put("B1", 58);
    playerPiecesLocations.put("Q1", 59);
    playerPiecesLocations.put("K1", 60);
    playerPiecesLocations.put("B2", 61);
    playerPiecesLocations.put("H2", 62);
    playerPiecesLocations.put("T2", 63);

    playerPiecesLocations.put("P1", 48);
    playerPiecesLocations.put("P2", 49);
    playerPiecesLocations.put("P3", 50);
    playerPiecesLocations.put("P4", 51);
    playerPiecesLocations.put("P5", 52);
    playerPiecesLocations.put("P6", 53);
    playerPiecesLocations.put("P7", 54);
    playerPiecesLocations.put("P8", 55);

    return playerPiecesLocations;
  }

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
