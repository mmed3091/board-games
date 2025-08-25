import java.util.Scanner;


// TODO
// - allow entering into grids
// - make game algorithm
// - implement rules
// - add additional things (score tracker, choosse to play again)



public class TicTacToe {
    
    // X | O | X
    // ---------
    // X | O | X
    // ---------
    // X | O | X


    public static void printRepeatedChars(char ch, int count) { 
        for(int i = 0; i < count; i ++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void printBoard(char[][] board) { 

        for(int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
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