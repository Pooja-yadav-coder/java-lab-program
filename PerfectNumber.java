
import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n > 0 && n % i == 0)
                sum += i;
        }

        if (n > 0 && sum == n)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");

        sc.close();
    }
}

