package chap06;

/* 배열을 나눔 */

import java.util.Scanner;

class Partition 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++)
        {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        partition(x, nx); // 배열 x를 나눔
        
        scanner.close();

    }   
    
    // 배열 요소 a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열을 나눔
    static void partition(int[] a, int n)
    {
        int pl = 0; // left point
        int pr = n-1; // right point
        int x = a[n/2]; // pivoit

        do
        {
            while(a[pl] < x) pl++; // pl이 가리키는 요소가 pivot보다 크거나 같을 때까지 반복
            while(a[pr] > x) pr--; // pr이 가리키는 요소가 pivot보다 작거나 같을 때까지 반복
            
            if(pl <= pr) // 교차지점
                swap(a, pl++, pr--);

        } while(pl <= pr);

        System.out.println("pivot = " + x );

        System.out.println("피벗 이하의 그룹");
        for(int i=0; i<=pl-1; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        if(pl > pr+1)
        {
            System.out.println("피벗과 같은 그룹");
            for(int i=pr+1; i<=pl-1; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for(int i=pr+1; i<n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
