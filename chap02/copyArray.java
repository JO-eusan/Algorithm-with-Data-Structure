package chap02;

/* 배열 b의 모든 요소를 배열 a에 복사하는 메서드를 작성 */

import java.util.*;

class copyArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("요소 수:");
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++)
        {
            b[i] = rand.nextInt(10);
            System.out.println("b[" + i + "]:" + b[i]);
        }

        copy(a, b);

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

        scanner.close();
    }  
    
    static void copy(int[] a, int[] b)
    {
        for(int i=0; i<a.length; i++)
            a[i] = b[i];
    }
}
