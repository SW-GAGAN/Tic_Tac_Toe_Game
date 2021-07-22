
import java.util.Scanner;

/**
 * print welcome message
 *
 * create a empty tic tac toe toe board
 * board should contain 3 Rows And 3 Calum
 */

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("WELCOME TO TIC TAC TOE GAME");
        Scanner scanner = new Scanner(System.in);

        char[][] gameBoard = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);

    }

}