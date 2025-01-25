package Practice1;

import java.util.Scanner;

public class AreaofAEquilateralTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double arm = sc.nextDouble();
        double area = Math.sqrt(3)/4 * arm*arm;

        System.out.println(area);
    }
}
