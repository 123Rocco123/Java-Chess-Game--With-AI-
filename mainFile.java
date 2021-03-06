import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class mainFile {
  boolean win = false;
  // The object below is used to store the board on which the players play on.
  Board BoardToPlayOn = new Board();

  AIMoves testFunc = new AIMoves();

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
  }

  // The function is used to setup the queen on the board.
  public void queenAssignment() {
    // Player Team Assignment
    queen1.rowAssignment(1);
    queen1.columnAssignment(4);
    queen1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    queen1.chessPieceLook("|Q1|");
    queen1.setSpace(queen1.row, queen1.column);
  }

  // The function is used to setup the king on the board.
  public void kingAssignment() {
    // Player Team Assignment
    king1.rowAssignment(1);
    king1.columnAssignment(5);
    king1.chessBoardAssignemnt(BoardToPlayOn.chessBoard);
    king1.chessPieceLook("|KI|");
    king1.setSpace(king1.row, king1.column);
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
        testFunc.AIChecker(BoardToPlayOn.chessBoard[newRow][newColumn]);
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        BoardToPlayOn.chessBoard = testFunc.defendFunction(newRow, newColumn);

        //boardOutput();
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
      //System.out.println(inputChecker(row, column));
      if (ObjectName.allowedMoves(newRow, newColumn) == true) {
        testFunc.AIChecker(BoardToPlayOn.chessBoard[newRow][newColumn]);
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        BoardToPlayOn.chessBoard = testFunc.defendFunction(newRow, newColumn);

        //boardOutput();
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
        testFunc.AIChecker(BoardToPlayOn.chessBoard[newRow][newColumn]);
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        BoardToPlayOn.chessBoard = testFunc.defendFunction(newRow, newColumn);

        //boardOutput();
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
        testFunc.AIChecker(BoardToPlayOn.chessBoard[newRow][newColumn]);
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        BoardToPlayOn.chessBoard = testFunc.defendFunction(newRow, newColumn);

        //boardOutput();
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
        testFunc.AIChecker(BoardToPlayOn.chessBoard[newRow][newColumn]);
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        BoardToPlayOn.chessBoard = testFunc.defendFunction(newRow, newColumn);

        //boardOutput();
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
        testFunc.AIChecker(BoardToPlayOn.chessBoard[newRow][newColumn]);
        BoardToPlayOn.chessBoard[newRow][newColumn] = BoardToPlayOn.chessBoard[row][column];
        BoardToPlayOn.chessBoard[row][column] = "|__|";

        BoardToPlayOn.chessBoard = testFunc.defendFunction(newRow, newColumn);

        //boardOutput();
      } else {
        System.out.println("Invalid Move");
        moveFunction();
      }
    } else {
      moveFunction();
    }
  }

  // The function below is used to add the AI's team to the chessBoard.
  public void AITeamSetter() {
    testFunc.chessBoardSetterFunc(BoardToPlayOn.chessBoard);

    BoardToPlayOn.chessBoard = testFunc.chessBoard;
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

      boardOutput();
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

    AITeamSetter();

    boardOutput();

    moveFunction();
  }

  public static void main(String[] args) {
    mainFile start = new mainFile();
    start.initializingFunc();
  }
}
