package Practice4;

import java.util.Scanner;

public class Pattern {

    public static void main(String[]  s){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1;  i<=n;  i++){
            for(int j=1; j<=i;  j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

    }
}
