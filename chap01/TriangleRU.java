package chap01;

/* 오른쪽 위가 직각인 이등변삼각형을 출력 */

import java.util.*;

class TriangleRU 
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

        triangleRU(n);

        scanner.close();
    }

    static void triangleRU(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
                System.out.print(" ");
            for(int j=i; j<n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
