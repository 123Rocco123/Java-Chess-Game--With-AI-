import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class mainFile {
  boolean win = false;
  // The object below is used to store the board on which the players play on.
  Board BoardToPlayOn = new Board();

  int round = 1;

  // The Objects below are used for the player's chess pieces.
  Pawn pawn1 = new Pawn();
  Pawn pawn2 = new Pawn();
  Pawn pawn3 = new Pawn();
  Pawn pawn4 = new Pawn();
  Pawn pawn5 = new Pawn();
  Pawn pawn6 = new Pawn();
  Pawn pawn7 = new Pawn();
  Pawn pawn8 = new Pawn();

  rook rook1 = new rook();
  rook rook2 = new rook();

  knight knight1 = new knight();
  knight knight2 = new knight();

  bishop bishop1 = new bishop();
  bishop bishop2 = new bishop();

  Queen queen1 = new Queen();
  King king1 = new King();

  // The Objects below are used for the player's chess pieces.
  Pawn pawn9 = new Pawn();
  Pawn pawn10 = new Pawn();
  Pawn pawn11 = new Pawn();
  Pawn pawn12 = new Pawn();
  Pawn pawn13 = new Pawn();
  Pawn pawn14 = new Pawn();
  Pawn pawn15 = new Pawn();
  Pawn pawn16 = new Pawn();

  rook rook3 = new rook();
  rook rook4 = new rook();

  knight knight3 = new knight();
  knight knight4 = new knight();

  bishop bishop3 = new bishop();
  bishop bishop4 = new bishop();

  Queen queen2 = new Queen();
  King king2 = new King();

  // The boardOutput function is to just output the chess board to the player.
  public void boardOutput() {
      for (String[] row : BoardToPlayOn.chessBoard) {
        System.out.println(Arrays.toString(row));
      }
  }

  // The function below is used to check if the columns and rows that the user wants to move the chess piece to are in fact on the chessboard.
     // This is used to not get the outOfBounds error when inputting a number greater than the number of rows of columns in the chessBoard used to play on.
  public boolean inputChecker(int setRow, int setColumn) {
    if (setRow > 8 || setRow < 1) {
      System.out.println("Invalid Row or Column inputted.");
      return true;
    } else if (setColumn > 8 || setColumn < 1) {
      System.out.println("Invalid Row or Column inputted.");
      return true;
    } else {
      return false;
    }
  }

  // This function is used to assign the rooks to the chessboard.
     // This is the inital setup function.
  public void rookAssignment() {
    // Player Team Assignment

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

    // AI Team Assignment

    rook3.rowAssignment(8);
    rook3.columnAssignment(1);
    rook3.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    rook3.chessPieceLook("|R3|");
    rook3.setSpace(rook3.row, rook3.column);

    rook4.rowAssignment(8);
    rook4.columnAssignment(8);
    rook4.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    rook4.chessPieceLook("|R4|");
    rook4.setSpace(rook4.row, rook4.column);
  }

  // The function below are used to assign the bishops on the chessboard.
  public void bishopAssignment() {
    // Player Team Assignment

    bishop1.rowAssignment(1);
    bishop1.columnAssignment(2);
    bishop1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    bishop1.chessPieceLook("|B1|");
    bishop1.setSpace(bishop1.row, bishop1.column);

    bishop2.rowAssignment(1);
    bishop2.columnAssignment(7);
    bishop2.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    bishop2.chessPieceLook("|B2|");
    bishop2.setSpace(bishop2.row, bishop2.column);

    // AI Team Assignment

    bishop3.rowAssignment(8);
    bishop3.columnAssignment(2);
    bishop3.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    bishop3.chessPieceLook("|B3|");
    bishop3.setSpace(bishop3.row, bishop3.column);

    bishop4.rowAssignment(8);
    bishop4.columnAssignment(7);
    bishop4.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    bishop4.chessPieceLook("|B4|");
    bishop4.setSpace(bishop4.row, bishop4.column);
  }

  // The function is used to setup the horses on the board.
  public void knightAssignment() {
    // Player Team Assignment

    knight1.rowAssignment(1);
    knight1.columnAssignment(3);
    knight1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    knight1.chessPieceLook("|K1|");
    knight1.setSpace(knight1.row, knight1.column);

    knight2.rowAssignment(1);
    knight2.columnAssignment(6);
    knight2.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    knight2.chessPieceLook("|K2|");
    knight2.setSpace(knight2.row, knight2.column);

    // AI Team Assignment

    knight3.rowAssignment(8);
    knight3.columnAssignment(3);
    knight3.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    knight3.chessPieceLook("|K3|");
    knight3.setSpace(knight3.row, knight3.column);

    knight4.rowAssignment(8);
    knight4.columnAssignment(6);
    knight4.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    knight4.chessPieceLook("|K4|");
    knight4.setSpace(knight4.row, knight4.column);
  }

  // The function is used to setup the queen on the board.
  public void queenAssignment() {
    // Player Team Assignment

    queen1.rowAssignment(1);
    queen1.columnAssignment(4);
    queen1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    queen1.chessPieceLook("|Q1|");
    queen1.setSpace(queen1.row, queen1.column);

    // AI Team Assignment

    queen2.rowAssignment(8);
    queen2.columnAssignment(4);
    queen2.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    queen2.chessPieceLook("|Q2|");
    queen2.setSpace(queen2.row, queen2.column);
  }

  // The function is used to setup the king on the board.
  public void kingAssignment() {
    // Player Team Assignment

    king1.rowAssignment(1);
    king1.columnAssignment(5);
    king1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    king1.chessPieceLook("|KI|");
    king1.setSpace(king1.row, king1.column);

    // AI Team Assignment
    king2.rowAssignment(8);
    king2.columnAssignment(5);
    king2.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    king2.chessPieceLook("|K2|");
    king2.setSpace(king2.row, king2.column);
  }

  // The function below is used to store the assignment of the pawns.
     // This is the inital setup function.
  public void pawnAssignment() {
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

    // AI Team Assignment

    pawn9.rowAssignment(7);
    pawn9.columnAssignment(1);
    pawn9.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn9.chessPieceLook("|PA|");
    pawn9.setSpace(pawn9.row, pawn9.column);

    pawn10.rowAssignment(7);
    pawn10.columnAssignment(2);
    pawn10.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn10.chessPieceLook("|PB|");
    pawn10.setSpace(pawn10.row, pawn10.column);

    pawn11.rowAssignment(7);
    pawn11.columnAssignment(3);
    pawn11.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn11.chessPieceLook("|PC|");
    pawn11.setSpace(pawn11.row, pawn11.column);

    pawn12.rowAssignment(7);
    pawn12.columnAssignment(4);
    pawn12.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn12.chessPieceLook("|PD|");
    pawn12.setSpace(pawn12.row, pawn12.column);

    pawn13.rowAssignment(7);
    pawn13.columnAssignment(5);
    pawn13.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn13.chessPieceLook("|PE|");
    pawn13.setSpace(pawn13.row, pawn13.column);

    pawn14.rowAssignment(7);
    pawn14.columnAssignment(6);
    pawn14.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn14.chessPieceLook("|PF|");
    pawn14.setSpace(pawn14.row, pawn14.column);

    pawn15.rowAssignment(7);
    pawn15.columnAssignment(7);
    pawn15.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn15.chessPieceLook("|PG|");
    pawn15.setSpace(pawn15.row, pawn15.column);

    pawn16.rowAssignment(7);
    pawn16.columnAssignment(8);
    pawn16.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    pawn16.chessPieceLook("|PH|");
    pawn16.setSpace(pawn16.row, pawn16.column);
  }

  // The function is used to ask the player where they want to move the pawn to, and then checks if thats possible with the rules set in their class.
  public void assignmentPawn(int row, int column, Pawn ObjectName) {
    Scanner input = new Scanner(System.in);

    System.out.println("Which row do you want to move the piece to? ");
    int newRow = input.nextInt();

    System.out.println("Which column do you want to move the piece to? ");
    int newColumn = input.nextInt();

    if (inputChecker(newRow, newColumn) == false) {
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The function is used to ask the player where they want to move the rook to, and then checks if thats possible with the rules set in their class.
  public void assignmentRook(int row, int column, rook ObjectName) {
    Scanner input = new Scanner(System.in);

    System.out.println("Which row do you want to move the piece to? ");
    int newRow = input.nextInt();

    System.out.println("Which column do you want to move the piece to? ");
    int newColumn = input.nextInt();

    if (inputChecker(newRow, newColumn) == false) {
      System.out.println(inputChecker(row, column));
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The function is used to ask the player where they want to move the bishop to, and then checks if thats possible with the rules set in their class.
  public void assignmentBishop(int row, int column, bishop ObjectName) {
    Scanner input = new Scanner(System.in);

    System.out.println("Which row do you want to move the piece to? ");
    int newRow = input.nextInt();

    System.out.println("Which column do you want to move the piece to? ");
    int newColumn = input.nextInt();

    if (inputChecker(newRow, newColumn) == false) {
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The function is used to ask the player where they want to move the knight to, and then checks if thats possible with the rules set in their class.
  public void assignmentKnight(int row, int column, knight ObjectName) {
    Scanner input = new Scanner(System.in);

    System.out.println("Which row do you want to move the piece to? ");
    int newRow = input.nextInt();

    System.out.println("Which column do you want to move the piece to? ");
    int newColumn = input.nextInt();

    if (inputChecker(newRow, newColumn) == false) {
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The function is used to ask the player where they want to move the queen to, and then checks if thats possible with the rules set in their class.
  public void assignmentQueen(int row, int column, Queen ObjectName) {
    Scanner input = new Scanner(System.in);

    System.out.println("Which row do you want to move the piece to? ");
    int newRow = input.nextInt();

    System.out.println("Which column do you want to move the piece to? ");
    int newColumn = input.nextInt();

    if (inputChecker(newRow, newColumn) == false) {
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The function is used to ask the player where they want to move the king to, and then checks if thats possible with the rules set in their class.
  public void assignmentKing(int row, int column, King ObjectName) {
    Scanner input = new Scanner(System.in);

    System.out.println("Which row do you want to move the piece to? ");
    int newRow = input.nextInt();

    System.out.println("Which column do you want to move the piece to? ");
    int newColumn = input.nextInt();

    if (inputChecker(newRow, newColumn) == false) {
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The move function is used to determine what object has to be checked to be moved when the player selects it.
  public void moveFunction() {
    Scanner input = new Scanner(System.in);

    Pawn[] pawnObjects = {this.pawn1, this.pawn2, this.pawn3, this.pawn4, this.pawn5, this.pawn6, this.pawn7, this.pawn8};
    rook[] rookObjects = {this.rook1, this.rook2};
    bishop[] bishopObjects = {this.bishop1, this.bishop2};
    knight[] knightObjects = {this.knight1, this.knight1};
    Queen[] queenObject = {this.queen1};
    King[] kingObject = {this.king1};

    while (this.win == false) {
      System.out.println("\n---------------------------------");
      System.out.println("            Round: " + this.round + "            ");
      System.out.println("---------------------------------");

      System.out.println("What row is the piece located at? ");
      int row = input.nextInt();

      System.out.println("What column is the piece located at? ");
      int column = input.nextInt();

      if (inputChecker(row, column) == true) {
        moveFunction();
        return;
      }

      for (int i = 1; i < 9; i++) {
        if ((BoardToPlayOn.chessBoard[row][column]).equals("|P" + i + "|")) {
          assignmentPawn(row, column, pawnObjects[(i - 1)]);
          break;
        } else if ((BoardToPlayOn.chessBoard[row][column]).equals("|R" + i + "|")) {
          assignmentRook(row, column, rookObjects[(i - 1)]);
          break;
        } else if ((BoardToPlayOn.chessBoard[row][column]).equals("|B" + i + "|")) {
          assignmentBishop(row, column, bishopObjects[(i - 1)]);
          break;
        } else if ((BoardToPlayOn.chessBoard[row][column]).equals("|K" + i + "|")) {
          assignmentKnight(row, column, knightObjects[(i - 1)]);
          break;
        } else if ((BoardToPlayOn.chessBoard[row][column]).equals("|Q" + i + "|")) {
          assignmentQueen(row, column, queenObject[(i - 1)]);
          break;
        } else if ((BoardToPlayOn.chessBoard[row][column]).equals("|KI|")) {
          assignmentKing(row, column, kingObject[(i - 1)]);
          break;
        } else if ((BoardToPlayOn.chessBoard[row][column]).equals("|__|")) {
          System.out.println("There is nothing there.");
          break;
        }
      }
      this.round += 1;
    }
  }

  // Used to setup the board.
  public void initializingFunc() {
    pawnAssignment();
    rookAssignment();
    bishopAssignment();
    knightAssignment();
    queenAssignment();
    kingAssignment();

    boardOutput();

    moveFunction();
  }

  public static void main(String[] args) {
    mainFile start = new mainFile();
    start.initializingFunc();
  }
}
