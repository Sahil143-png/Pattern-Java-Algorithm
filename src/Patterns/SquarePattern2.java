package Patterns;

import java.util.Scanner;

public class SquarePattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
