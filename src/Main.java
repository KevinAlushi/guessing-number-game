import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the guessing game!\nI will pick a number from 1 to 100 and you have a number of chances to guess it based on the difficulty.\nfrom each guess i will tell you if the number is higher or lower.");

        int number = random.nextInt(100) + 1;



        System.out.println("Please select the difficulty level: \n1. Easy    (10 chances)\n2. Medium  (5 chances)\n3. Hard    (3 chances)");

        int difficulty = scanner.nextInt();

        if(difficulty == 1){
            System.out.println("Type you first guess: ");
            int guess1 = scanner.nextInt();

            if(guess1 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess1 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess2 = scanner.nextInt();

            if(guess2 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess2 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess3 = scanner.nextInt();

            if(guess3 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess3 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess4 = scanner.nextInt();

            if(guess4 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess4 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess5 = scanner.nextInt();

            if(guess5 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess5 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess6 = scanner.nextInt();

            if(guess6 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess6 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess7 = scanner.nextInt();

            if(guess7 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess7 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess8 = scanner.nextInt();

            if(guess8 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess8 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess9 = scanner.nextInt();

            if(guess9 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess9 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess10 = scanner.nextInt();

            if(guess10 < number){
                System.out.println("Sorry... You didn't find the number. It was: " + number);
            }else if(guess10 > number){
                System.out.println("Sorry... You didn't find the number. It was: " + number);
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

        }

        if(difficulty == 2){
            System.out.println("Type you first guess: ");

            int guess1 = scanner.nextInt();

            if(guess1 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess1 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess2 = scanner.nextInt();

            if(guess2 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess2 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess3 = scanner.nextInt();

            if(guess3 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess3 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess4 = scanner.nextInt();

            if(guess4 < number){
                System.out.println("The number is higher! Try again.");
            }else if(guess4 > number){
                System.out.println("The number is lower! Try again.");
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }

            int guess5 = scanner.nextInt();

            if(guess5 < number){
                System.out.println("Sorry... You didn't find the number. It was: " + number);
            }else if(guess5 > number){
                System.out.println("Sorry... You didn't find the number. It was: " + number);
            }else{
                System.out.println("You found it! It was: " + number);
                return;
            }
        }
        if(difficulty == 3) {
            System.out.println("Type you first guess: ");
            int guess1 = scanner.nextInt();

            if (guess1 < number) {
                System.out.println("The number is higher! Try again.");
            } else if (guess1 > number) {
                System.out.println("The number is lower! Try again.");
            } else {
                System.out.println("You found it! It was: " + number);
                return;
            }
            int guess2 = scanner.nextInt();
            if (guess2 < number) {
                System.out.println("The number is higher! Try again.");
            } else if (guess2 > number) {
                System.out.println("The number is lower! Try again.");
            } else {
                System.out.println("You found it! It was: " + number);
                return;
            }
            int guess3 = scanner.nextInt();
            if (guess3 < number) {
                System.out.println("Sorry... You didn't find the number. It was: " + number);
            } else if (guess3 > number) {
                System.out.println("Sorry... You didn't find the number. It was: " + number);
            } else {
                System.out.println("You found it! It was: " + number);
            }
        }else{
            System.out.println("you have to select a difficulty form 1 to 3. Restart the Program.");
        }
    }
}