package chap01;

/* 왼쪽 위가 직각인 이등변삼각형을 출력 */

import java.util.*;

class TriangleLU 
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

        triangleLU(n);

        scanner.close();
    }

    static void triangleLU(int n)
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
