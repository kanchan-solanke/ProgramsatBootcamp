import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a");
        double a = sc.nextInt();
        System.out.println("Enter a value of b");
        double b = sc.nextInt();
        System.out.println("Enter a value of c");
        double c = sc.nextInt();

        System.out.println("The result for a + b *c is "+ (a + (b * c)));
        System.out.println("The result for a * b + c is "+ ((a * b) + c));
        System.out.println("The result for c + a / b is " +(c + (a / b)));
        System.out.println("The result for a % b + c is "+ ((a % b) + c));
    }
}
