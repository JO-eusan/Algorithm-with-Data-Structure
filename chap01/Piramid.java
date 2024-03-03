package chap01;

/* n단의 피라미드를 출력하는 메서드 */

import java.util.*;

class Piramid 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;

        do
        {
            System.out.print("n값:");
            n = scanner.nextInt();
        } while(n<=0);

        spira(n);

        scanner.close();
    }   
    
    static void spira(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
                System.out.print(" ");
            for(int j=0; j<i; j++)
                System.out.print("*");
            System.out.print("*");
            for(int j=0; j<i; j++)
                System.out.print("*");
            for(int j=0; j<n-1-i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
