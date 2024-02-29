package chap01;

/* 양수만 입력하여 1,2,...,n의 합을 구하기 */

import java.util.Scanner;

class SumFor2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do
        {
            System.out.print("값:");
            n = scanner.nextInt();
        } while(n <= 0);

        int sum = 0; // 합
        for(int i=1; i<=n; i++)
            sum += i;
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        scanner.close();
    }    
}
