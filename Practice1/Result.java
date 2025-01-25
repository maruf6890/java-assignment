package Practice1;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 40) {
            System.out.println("F");
        } else if (n < 50) {
            System.out.println("C+");
        } else if (n < 60) {
            System.out.println("C+");
        } else if (n < 70) {
            System.out.println("B");
        } else if (n < 80) {
            System.out.println("A");
        } else if (n < 90) {
            System.out.println("A");
        } else {
            System.out.println("A+");
        }
    }
}
