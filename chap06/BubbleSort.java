package chap06;

/* 버블 정렬(.ver1) */

import java.util.Scanner;

class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("버블 정렬 ver.1");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++)
        {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x,nx); // 배열 x를 버블 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<nx; i++)
            System.out.println("x[" + i + "] = " + x[i]);
        
        scanner.close();
    }    

    /* a[idx1]과 a[idx2]의 값을 교환 */
    static void swap(int[] a, int idx1, int idx2)
    {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    /* 버블 정렬 */
    static void bubbleSort(int[] a, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=n-1; j > i; j--)
            {
                if(a[j-1] > a[j])
                    swap(a, j-1, j);
            }
        }
    }
}
