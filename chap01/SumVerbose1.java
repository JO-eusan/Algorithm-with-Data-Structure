package chap01;

/* 1,2,...,n의 합과 그 값을 구하는 과정을 출력(1) */

import java.util.Scanner;

class SumVerbose1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");
        do
        {
            System.out.print("n값:");
            n = scanner.nextInt();
        } while(n<=0);

        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");

            sum += i;
        }
        System.out.print(sum);
        
        scanner.close();
    }    
}
