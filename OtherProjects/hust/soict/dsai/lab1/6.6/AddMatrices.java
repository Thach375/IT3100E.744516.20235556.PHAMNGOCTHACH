import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Nhap so hang ma tran: ");
        int rows = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.println("Nhap so cot ma tran: ");
        int cols = keyboard.nextInt();
        keyboard.nextLine(); 

        List<List<Integer>> mat_1 = new ArrayList<>();
        // input first matrix
        for (int i = 0; i < rows; i++) {
            System.out.println("Nhap dong thu: " + (i + 1) + (" cua ma tran 1"));
            String list = keyboard.nextLine();

            String[] parts = list.split(" ");
            List<Integer> numbers = new ArrayList<>();
            for (String part : parts) {
                int number = Integer.parseInt(part);
                numbers.add(number);
            }
            mat_1.add(numbers);
        }

        // input second matrix
        List<List<Integer>> mat_2 = new ArrayList<>();
        for (int j = 0; j < rows; j++) {
            System.out.println("Nhap dong thu " + (j + 1) + " cua ma tran 2");
            String list = keyboard.nextLine();

            String[] parts = list.split(" ");
            List<Integer> numbers = new ArrayList<>();
            for (String part : parts) {
                int number = Integer.parseInt(part);
                numbers.add(number);
            }
            mat_2.add(numbers);
        }

        // Add 2 matrices
        System.out.println("Ma tran tong:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat_1.get(i).get(j) + mat_2.get(i).get(j) + " ");
            }
            System.out.println(); 
        }

        keyboard.close(); 
    }
}
