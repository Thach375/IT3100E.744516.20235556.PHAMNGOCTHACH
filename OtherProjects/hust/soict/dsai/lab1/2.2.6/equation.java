import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1 for calculate linear_equation \n      2 for calculate linear_system \n      3 for calulate second_equation");
        int n = scanner.nextInt();
        
        if (n == 1) {
            System.out.print("Nhap so a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Nhap so b: ");
            double b = scanner.nextDouble();

            linear_equation(a, b);
        }

        if (n == 2) {
            System.out.print("Nhap so a_1_1: ");
            double a_1_1 = scanner.nextDouble();
            
            System.out.print("Nhap so a_1_2: ");
            double a_1_2 = scanner.nextDouble();
    
            System.out.print("Nhap so b_1: ");
            double b_1 = scanner.nextDouble();
            
            System.out.print("Nhap so a_2_1: ");
            double a_2_1 = scanner.nextDouble();
            
            System.out.print("Nhap so a_2_2: ");
            double a_2_2 = scanner.nextDouble();
            
            System.out.print("Nhap so b_2: ");
            double b_2 = scanner.nextDouble();

            linear_system(a_1_1, a_1_2, b_1, a_2_1, a_2_2, b_2);
        }
        
        if (n==3) {
            System.out.print("Nhap so a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhap so b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhap so c: ");
            double c = scanner.nextDouble();

            second_degree(a, b, c);
        }
    }


    public static void linear_equation(double a, double b) {
        if (a != 0) {
            System.out.println("Infinity solution");
        }
        System.out.println("The soltion is: " + (-b/a));
    }


    public static void  linear_system(double a_1_1, double a_1_2, double b_1, double a_2_1, double a_2_2, double b_2){
        double D = a_1_1 * a_2_2 - a_1_2 * a_2_1;
        if (D == 0) {
            System.out.println("Infinity solution");
        }
        double D_x = b_1*a_2_2 - b_2*a_1_2;
        double D_y = a_1_1*b_2 - a_2_1*b_1;
        if (D_x == 0 | D_y == 0) {
            System.out.println("No solution");
        }
        System.out.println(D_x + ", " + D_y + " are the solution of this equation");
    }


    public static void second_degree (double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta < 0) {
            System.out.println("No solution");
        }

        if (delta == 0) {
            System.out.println((-b/(2*a)) + "is the only solution");
        }

        System.out.println((-b+Math.pow(delta, 0.5)/(2*a)) + ", " + (-b-Math.pow(delta, 0.5)/(2*a)) + "are the solution");
    }
    
}

