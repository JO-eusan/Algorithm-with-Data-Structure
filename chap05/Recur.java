package chap05;

/* 재귀 함수 이해 */

import java.util.*;

class Recur 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        recur(x);
        
        scanner.close();
    }    

    static void recur(int n)
    {
        if( n>0 )
        {
            recur( n - 1 );
            System.out.println(n);
            recur( n - 2 );
        }
    }
}
