
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Please enter a 3-digit number");
        } else {
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == n)
                System.out.println("Armstrong number");
            else
                System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}

