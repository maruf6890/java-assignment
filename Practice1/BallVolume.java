package Practice1;
import java.util.Scanner;
public class BallVolume {
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        double radius= sc.nextDouble();
        System.out.println(3.0/4.0*Math.PI*Math.pow(radius,3.0));
    }
}
