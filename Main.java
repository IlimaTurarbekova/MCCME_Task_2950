import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = n * 45 + n / 2 * 5 + (n - 1) / 2 * 15;
        System.out.println(9 + k / 60 + " " + k % 60);
    }
}
