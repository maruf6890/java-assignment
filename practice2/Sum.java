package practice2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sum=0;
        for(int i=0;  i<=20; i+=2){
            sum+=i;
        }
        System.out.println(sum);
    }
}
