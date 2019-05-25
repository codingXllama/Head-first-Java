package GuessingGame;

public class GuessGame {

    // Creating the Game instance variables for each of the 3 players
    Player p1;
    Player p2;
    Player p3;

    // creating 3 player object and assigning them to the instance variables we just
    // created above
    public void StartGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Declaring the Variables to hold the player guess
        int player1_guess = 0;
        int player2_guess = 0;
        int player3_guess = 0;

        // Declaring 3 variables to hold the boolean value of the each players Guess.
        // True indicating the player has made the correct guess, false if the player
        // didn't guess correctly
        boolean isP1_Right = false;
        boolean isP2_Right = false;
        boolean isP3_Right = false;

        // Creating the number the player has to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("The number to guess is: "+targetNumber);
            p1.guess(1);
            p2.guess(2);
            p3.guess(3);

            // Each player create their own guess

            player1_guess = p1.number;
            System.out.println("Player 1 Guessed: " + player1_guess);

            player2_guess = p2.number;
            System.out.println("Player 2 Guessed: " + player2_guess);

            player3_guess = p3.number;
            System.out.println("Player 3 Guessed: " + player3_guess);

//            Checking each of the players Guess to check if it's correct or not
            if (player1_guess == targetNumber) {
                isP1_Right = true;
            }
            if (player2_guess == targetNumber) {
                isP2_Right = true;
            }
            if (player3_guess == targetNumber) {
                isP3_Right = true;
            }

//            checking if one of the 3 players have guessed the target number
            if (isP1_Right || isP2_Right || isP3_Right) {
                System.out.println("We have a winner ! ");
                System.out.println("Player one got it right: " + isP1_Right);
                System.out.println("Player two got it right: " + isP2_Right);
                System.out.println("Player 3 got it right: " + isP3_Right);
                System.out.println("Game over!");
//                Ending the game loop since the game is now over since a player has guessed the targetNumber
                break;

            } else {
//              We will enaable the game loop, until we search for a winning player
                System.out.printf("Players will have to try again: ");
            } //end of if else statement
        }//end of loop
    }//end of method
}//end of class
