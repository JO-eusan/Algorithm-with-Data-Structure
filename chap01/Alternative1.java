package chap01;

/* +와 -를 번갈아 출력(1) */

import java.util.Scanner;

class Alternative1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값:");
        int n = scanner.nextInt();

        for(int i=0; i<n; i++)
        {
            if(i%2 == 0) // 짝수
                System.out.print("+");
            else // 홀수
                System.out.print("-");
        }

        scanner.close();
    }    
}
