package chap05;

/* 팩토리얼값을 재귀적으로 구함 */

import java.util.*;

class Factorial 
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("정수를 입력하세요: ");
       int x = scanner.nextInt();

       System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");

       scanner.close();
    }  
    
    static int factorial(int n)
    {
        if(n > 0)
            return n * factorial(n-1);
        else 
            return 1;
    }
}
