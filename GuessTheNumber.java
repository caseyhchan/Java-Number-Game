import java.util.Scanner; // for reading user inputs

public class GuessTheNumber {

    // function for number guessing game
    public static void 
    guessTheNumberGame() {
        // set the target number between 0 and 100
        int target = (int)(100*Math.random());
        System.out.println(target);

        // prompt user to guess a number
        System.out.println("Can you guess my number between 0 and 100 in 5 tries?"); 

        int trials = 5;

        // initialize scanner to read user input
        Scanner reader = new Scanner(System.in); 

        for (int i = 0; i<trials;i++) {
            // prompt user to guess a number
            System.out.println("Enter a number: "); 

            // scan and store user input
            int guess = reader.nextInt();

            // if target number is correctly guessed
            if (guess == target) {
                System.out.println("Congrats! You guessed the number!"); 
                break;
            }
            
            // if the target number is less than the guess
            else if (guess > target) {
                System.out.println("Try again! Hint: the number is less than " + guess); 
            }

            // if the target number is greater than the guess
            else if (guess < target) {
                System.out.println("Try again! Hint: the number is greater than " + guess); 
            }

            // if target number is correctly guessed
            if (i == trials) {
                System.out.println("Whoops! You ran out of tries! Better luck next time."); 
                break;
            }


            // //once finished
            // reader.close();

            System.out.println(guess);
        }
            
    }

    // Driver Code
    public static void
    main(String arg[])
    {
    
        // Function Call
        guessTheNumberGame();
    }

}
