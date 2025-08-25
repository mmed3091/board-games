import java.util.Scanner;

public class TicTacToe {

    /**
     * Prints desired characters up to provided count
     */
    public static void printRepeatedChars(char ch, int count) { 
        for(int i = 0; i < count; i ++) {
            System.out.print(ch);
        }
        System.out.println();
    }


    /**
     * prints TicTacToe Board
     */
    public static void printBoard(char[][] board) { 

        for(int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]); // print value
                
                if (j != board[i].length - 1){
                    System.out.print(" | "); // print vertical borders

                }
            }
            System.out.println();
            
            if(i == 0 || i == 1){ // print horizontal borders
                printRepeatedChars('-', 9);
            }
        } 
    }

    /**
     * Checks whether there is a winner to the game
     */
    public static boolean checkWinner(char[][] board, int row, int col, char symbol) {

        boolean rowWin = true, colWin = true, diagWin = true, antiDiagWin = true;

        for (int i = 0; i < 3; i++) {
            rowWin &= board[row][i] == symbol;
            colWin &= board[i][col] == symbol;
            diagWin &= board[i][i] == symbol;
            antiDiagWin &= board[i][2 - i] == symbol;
        }
        return rowWin || colWin || (row == col && diagWin) || (row + col == 2 && antiDiagWin);
    }



    /**
     * Plays the game
     */
    public static void playGame(char[][] board) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Start the game by entering row and column values."); // 

        boolean play = true;

        while (play) {
            printBoard(board);  
            System.out.print("Enter comma separated row and column values: ");  
            String[] values = scanner.nextLine().split(",");  
                 

            int row = Integer.parseInt(values[0]) - 1; // subtract by 1 to get array index value TODO: fix
            int col = Integer.parseInt(values[1]) - 1;

            board[row][col] = 'X';
            
            if(checkWinner(board, row, col, 'X')) {
                System.out.println("You won!");
                return;
            }

            // check if value already in the box
            // check if there are three in a row anywheree
            // check if game is over
            // else computer makes a random move

            // ERRORR CHECKS
            // check if input valid
            // check if input out of bound




        } 
        

        

    }

    public static void main(String[] args) {

        char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
        };

        playGame(board);


    }
}