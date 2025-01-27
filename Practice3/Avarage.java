package Practice3;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double sum=0;
        for(int i=0;  i<n;  i++){
            double  x= sc.nextDouble();
            sum+=x;

        }

        System.out.println(sum/n);
    }
}
