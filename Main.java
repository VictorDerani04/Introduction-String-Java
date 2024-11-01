import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many oranges would you like to order?");
        Scanner scan = new Scanner(System.in);
        int numOranges = scan.nextInt();

        System.out.println("How much is each orange?");
        System.out.print("$");
        double money = scan.nextDouble();
        System.out.println(money);

        System.out.println("You ordered "+ numOranges +" oranges at");
        System.out.print("$"+ money +" each for a total of $");
        System.out.print(numOranges * money);
    }
}