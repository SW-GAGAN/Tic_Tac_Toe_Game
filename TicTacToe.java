import java.util.*;

public class TicTacToe {
    // creating meathod called Creatboard
    public static char[] CreateBoard() {
        char[] board = new char[10];
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public static void main(String[] args) {
        // print welcome message
        System.out.println("welcome toTicTacTo game");
        char[] board = CreateBoard();

    }
}