package game.com;
import java.util.*;

public class TicGame {
    static String[] board;
    static String turn;

    // Decide the combination of the board.
    static String checkWinner() {
        for (int ctr = 0; ctr <= 7; ctr++) {
            String line = null;

            switch (ctr) {
                case 0: line = board[0] + board[1] + board[2];
                break;
                case 1: line = board[3] + board[4] + board[5]; 
                break;
                case 2: line = board[6] + board[7] + board[8]; 
                break;
                case 3: line = board[0] + board[3] + board[6];
                break;
                case 4: line = board[1] + board[4] + board[7]; 
                break;
                case 5: line = board[2] + board[5] + board[8]; 
                break;
                case 6: line = board[0] + board[4] + board[8]; 
                break;
                case 7: line = board[2] + board[4] + board[6]; 
                break;
            }

            // Check winner.
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int ctr = 0; ctr < 9; ctr++) {
            if (Arrays.asList(board).contains(String.valueOf(ctr + 1))) {
                break;
            } else if (ctr == 8) {
                return "Draw";
            }
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    // To print the board.
    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int ctr = 0; ctr < 9; ctr++) {
            board[ctr] = String.valueOf(ctr + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
        System.out.println("X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            // Exception handling.
            try {
                numInput = sc.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }

            // Logic to decide the turn.
            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken please  re-enter slot number:");
            }
        }

        if (winner.equals("Draw")) {
            System.out.println("It's a draw! Play again to see who wins.");
        } else {
            System.out.println("Congratulations! " + winner + " has won! Thanks for playing.");
        }

        sc.close();
    }
}
