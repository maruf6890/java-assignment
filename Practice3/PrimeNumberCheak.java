package Practice3;

import java.util.Scanner;

public class PrimeNumberCheak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("None Prime");
        }else if(n==1){
            System.out.println("None Prime");
        }else{
            boolean isPrime=true;
            for(int i=2; i*i<=n;  i++){
                if(n%i==0){
                  isPrime=false;
                  break;
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }else{
                System.out.println("None Prime");
            }


        }

    }
}
