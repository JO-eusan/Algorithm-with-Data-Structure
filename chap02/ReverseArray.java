package chap02;

/* 배열 요소에 값을 읽어 들여 역순으로 정렬 */

import java.util.*;

class ReverseArray 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++)
        {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        reverse(x); // 배열 x의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = " + Arrays.toString(x));
        
        scanner.close();
    }   
    
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꾸는 메서드
    static void swap(int[] a, int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a)
    {
        for(int i=0; i<a.length/2; i++)
            swap(a, i, a.length-1-i);
    }
}
