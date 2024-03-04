package chap02;

/* 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성 */

import java.util.*;

class sumOfArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요소 수:");
        int n = scanner.nextInt();

        int[] x = new int[n];
        for(int i=0; i<n; i++)
        {
            x[i] = rand.nextInt(10);
            System.out.println("x[" + i + "]:" + x[i]);
        }

        System.out.println("배열에 모든 요소의 합은 " + sumOf(x) + "입니다.");

        scanner.close();
    }
    
    static int sumOf(int[] a)
    {
        int sum = 0;
        for(int i=0; i<a.length; i++)
            sum += a[i];
        return sum;
    }
}
