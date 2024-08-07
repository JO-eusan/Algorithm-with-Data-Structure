package chap06;

/* 셸 정렬(버전 2) */

import java.util.Scanner;

class ShellSort2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);    

        System.out.println("셸 정렬(버전 2)");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++)
        {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        shellSort(x,nx); // 배열 x를 셸 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
        
        scanner.close();
    }    

    static void shellSort(int[] a, int n)
    {
        int h;
        for(h=1; h<n; h=h*3+1) // h의 초기값을 구함
            ;
        
        for( ; h>0; h /=3) // 정렬 시작
        {
            for(int i=h; i<n; i++)
            {
                int j;
                int tmp = a[i];
                for(j=i-h; j>=0 && a[j]>tmp; j-=h)
                    a[j+h] = a[j];
                a[j+h] = tmp;
            }
        }
    }
}
