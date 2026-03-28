import java.util.Scanner;

public class _4_10_power_with_modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter m: ");
        double m = sc.nextDouble();
        System.out.println(powerWithModulo(a, b, m));
    }

    public static double powerWithModulo(double a, double b, double m) {
        if (b == 0)
            return 1;
        if (b < 0)
            return powerWithModulo(1 / a, Math.abs(b), m);
        if (b % 2 == 0)
            return powerWithModulo((a % m * a % m) % m, b / 2, m);
        else
            return (a % m * powerWithModulo(a, b - 1, m) % m) % m;
    }
}
