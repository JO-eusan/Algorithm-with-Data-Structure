package chap05;

/* 유클리드 호제법으로 최대공약수를 구함 */

import java.util.*;

class EuclidGCD 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요: "); int x = scanner.nextInt();
        System.out.print("정수를 입력하세요: "); int y = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(x,y) + "입니다.");
        
        scanner.close();
    }   
    
    static int gcd(int x, int y)
    {
        if( y==0 )
            return x;
        else
            return gcd(y, x%y);
    }
}
