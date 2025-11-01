package Patterns;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(j==i || j==rows-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
