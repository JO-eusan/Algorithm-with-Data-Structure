package chap01;

/* 가우스 덧셈 */

import java.util.Scanner;

class GaussSum 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if(n%2 == 0)
            System.out.print((1+n)*(n/2));
        else if(n%2 == 1)
            System.out.print((1+n)*(n/2) + (n+1)/2);

        scanner.close();
    }    
}
