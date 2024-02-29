package chap01;

/* 양수만 출력하는 뺄셈 프로그램 */

import java.util.Scanner;

class Sub 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a값:");
        int a = scanner.nextInt();

        int b;
        do
        {

            System.out.print("b값:");
            b = scanner.nextInt();
            
            if(a>=b)
                System.out.println("a보다 b가 큰 값을 입력하세요!");
            
        } while(a>=b);

        System.out.println("b-a는 " + (b-a) + "입니다.");

        scanner.close();
    }    
}
