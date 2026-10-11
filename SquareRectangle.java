
import java.util.Scanner;

class SquareRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        if (length <= 0 || breadth <= 0)
            System.out.println("Invalid dimensions");
        else if (length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is a rectangle");

        sc.close();
    }
}

