import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly books (v): ");
        int v = scanner.nextInt();

        System.out.print("Enter yearly visitors (n): ");
        int n = scanner.nextInt();

        // 12 months in a year divided by total visitors
        double k = (v * 12.0) / n;

        System.out.println("Average books per visitor per year (k): " + k);
    }
}