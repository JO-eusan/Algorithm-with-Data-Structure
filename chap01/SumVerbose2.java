package chap01;

/* 1,2,...n의 합과 그 값으 구하는 과정을 출력(2) */

import java.util.Scanner;

class SumVerbose2 
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
        for(int i=1; i<n; i++)
        {
            System.out.print(i + " + ");
            sum += i;
        }
        sum += n;
        System.out.print(n + " = " + sum);
        
        scanner.close();
    }      
}
