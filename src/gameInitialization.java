import java.util.Scanner;

// define the parameters of every game and instance the Board and drawBoard class
public class gameInitialization {
//    Board board = new Board();
    int n = 0;
    Scanner in = new Scanner(System.in);

    Boolean gameOver = false;
    int turnNum = 1;

    int round = 1;

    Board board;
    drawBoard draw;

    PrintAllRecord print = new PrintAllRecord();
    public gameInitialization(){
        System.out.printf("Welcome to the\n");
    }
}
