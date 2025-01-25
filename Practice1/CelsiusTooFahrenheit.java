package Practice1;

import java.util.Scanner;

public class CelsiusTooFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Celsius  = sc.nextDouble();
        double f=(Celsius/5) *9+32;

        System.out.println(f);
    }
}
