import java.util.Scanner;

public class md15 {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Please enter the amount of coins you want to exchange: ");

        int coinsLeft = keyboardInput.nextInt();
        System.out.println("Your coin amount is: " + coinsLeft);

        System.out.println("\n\nYou'll get: ");

        int twoEuros = coinsLeft / 200;
        coinsLeft = coinsLeft % 200;
        if (twoEuros > 0){
            System.out.println(twoEuros + " <=== 2 euro coin(s)");}
        int oneEuro = coinsLeft / 100;
        coinsLeft = coinsLeft % 100;
        if (oneEuro > 0){
            System.out.println(oneEuro + " <=== 1 euro coin(s)");}
        int fiftyCents = coinsLeft / 50;
        coinsLeft = coinsLeft % 50;
        if (fiftyCents > 0){
            System.out.println(fiftyCents + " <=== 50 cent coin(s)");}
        int twentyCents = coinsLeft / 20;
        coinsLeft = coinsLeft % 20;
        if (twentyCents > 0){
            System.out.println(twentyCents + " <=== 20 cent coin(s)");}
        int tenCents = coinsLeft / 10;
        coinsLeft = coinsLeft % 10;
        if (tenCents > 0){
            System.out.println(tenCents + " <=== 10 cent coin(s)");}
        int fiveCents = coinsLeft / 5;
        coinsLeft = coinsLeft % 5;
        if (fiveCents > 0){
            System.out.println(fiveCents + " <=== 5 cent coin(s)");}
        int twoCents = coinsLeft / 2;
        coinsLeft = coinsLeft % 2;
        if (twoCents > 0){
            System.out.println(twoCents + " <=== 2 cent coin(s)");}
        int oneCent = coinsLeft;
        if (coinsLeft > 0){
            System.out.println(oneCent + " <=== 1 cent coin(s)");}
    }
}
