import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String strName = keyboard.nextLine();

        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();

        System.out.println("How tall are you (meter)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Mr/Mrs " + strName + ", " + iAge + " years old and " + dHeight + " meters tall.");
    }
}
