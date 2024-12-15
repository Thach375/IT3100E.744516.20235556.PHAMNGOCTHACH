import java.util.Scanner;

public class Calculatee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double num_1 = scanner.nextDouble();
        
        System.out.print("Nhap so thu hai: ");
        double num_2 = scanner.nextDouble();

        cal_sum(num_1, num_2);
        diff_two_num (num_1, num_2);
        product_two_num(num_1, num_2);
        quotion(num_1,  num_2);
        
    }

    public static void cal_sum (double num_1, double num_2) {
        double summ = num_1 + num_2;
        System.out.print("Tong cua 2 so la: " + summ);
    } 

    public static void diff_two_num (double num_1, double num_2) {
        double diff = num_1 - num_2;
        System.out.print("Hieu 2 so la: " + diff);
    }

    public static void product_two_num(double num_1, double num_2) {
        double prod =  num_1 * num_2;
        System.out.print("Tong hai so la: " + prod);
    }
    
    public static void quotion(double num_1, double num_2) {
        if (num_2 == 0) {
            System.out.println("Khong hop le");
        }
        double quot = num_1 / num_2;
        System.out.print("Thuong cua hai so la: " + quot);
    } 
}
