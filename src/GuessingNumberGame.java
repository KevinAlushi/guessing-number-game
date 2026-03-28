import java.util.Scanner;
import java.util.Random;

class GuessingNumberGame{
    static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the guessing game!\nI will pick a number from 1 to 100 and you have a number of chances to guess it based on the difficulty.\nfrom each guess i will tell you if the number is higher or lower.");

        int number = random.nextInt(100) + 1;

        System.out.println("Please select the difficulty level: \n1. Easy    (10 chances)\n2. Medium  (5 chances)\n3. Hard    (3 chances)");

        //Let you choose the difficulty
        int difficulty = scanner.nextInt();
        int chances = 0;

        if (difficulty == 1){
            chances = 10;
        }else if(difficulty == 2){
            chances = 5;
        }else if(difficulty == 3){
            chances = 3;
        }else{
            System.out.println("There are only 3 levels of difficulty, please restart the program.");
            return;
        }

        //The logic of the game
        for(int i = 0; i < chances; i++){
            System.out.print("Type your guess here: ");
            int guess = scanner.nextInt();
            if(guess > number){
                System.out.println("The number is smaller.");
            }else if(guess < number){
                System.out.println("The number is bigger.");
            }else{
                System.out.println("You found it! The number was " + number);
                return;
            }
        }
        System.out.println("Sorry, you didn't find the number, it was: " + number + ". Restart the program and try again.");

    }
}