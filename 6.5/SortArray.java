import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner lst = new Scanner(System.in);

        System.out.println("Nhap day: ");
        String list = lst.nextLine();

        String[] parts = list.split(" ");

        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        for (String part : parts) {
            int number = Integer.parseInt(part);  
            numbers.add(number);
            count += 1;
        }

        for (int i=0; i<count-1; i++) {
            for (int j=i+1; j<count; j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    Collections.swap(numbers, i, j);
                }
            }
        }
        System.out.println(numbers);
    }
}