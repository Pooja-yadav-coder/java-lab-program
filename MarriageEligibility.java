
import java.util.Scanner;

class MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (gender.equals("male")) {
            if (age >= 21)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else if (gender.equals("female")) {
            if (age >= 18)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else {
            System.out.println("Invalid gender");
        }

        sc.close();
    }
}

