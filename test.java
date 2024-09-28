import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Chuỗi cần tách
        Scanner lst = new Scanner(System.in);
        System.out.println("Nhap day: ");
        String list = lst.nextLine();

        // Tách chuỗi dựa trên khoảng trắng
        String[] parts = list.split(" ");

        // Tạo danh sách để lưu các số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Chuyển từng phần tử của mảng chuỗi thành số nguyên và thêm vào danh sách
        for (String part : parts) {
            int number = Integer.parseInt(part);  // Chuyển chuỗi thành số nguyên
            numbers.add(number);  // Thêm vào danh sách
        }

        // In ra danh sách các số nguyên
        System.out.println(numbers);
    }
}
