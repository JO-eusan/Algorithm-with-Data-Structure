package chap01;

/* a부터 b까지의 합을 구하는 메서드 */

import java.util.Scanner;

class SumMethod 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print(sumof(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }  
    
    static int sumof(int a, int b)
    {
        // 대소 관계 무시
        if(b<a)
        {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int sum = 0;
        for(int i=a; i<=b; i++)
            sum += i;
        
        return sum;
    }
}
