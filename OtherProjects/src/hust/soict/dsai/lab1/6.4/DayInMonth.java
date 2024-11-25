import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int m = 0;
        while (m<1 | m>12){
            System.out.print("Nhap thang: ");
            m = keyboard.nextInt();
        }
        System.out.print("Nhap nam: ");
        int y = keyboard.nextInt();

        if (m==1|m==3|m==5|m==7|m==8|m==10|m==12) {
            System.out.println("Thang " + m + " nam " + y + " co 31 ngay.");
        }

        if (m==4|m==6|m==9|m==11) {
            System.out.println("Thang " + m + " nam " + y + " co 30 ngay.");
        }

        if (m==2 & y%4==0) {
            System.out.println("Thang " + m + " nam " + y + " co 29 ngay.");
        }
        if (m==2 & y%4 != 0){
        System.out.println("Thang " + m + " nam " + y + " co 28 ngay.");
        }
    }
}
