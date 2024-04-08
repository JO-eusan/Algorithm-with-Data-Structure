package chap06;

/* 퀵 정렬 */

import java.util.*;

class QuickSort 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++)
        {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        quickSort(x, 0, nx-1); // 배열 x를 퀵 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0; i<nx; i++)
            System.out.println("x[" + i + "] = " + x[i]);

        scanner.close();
    }

    static void swap(int[] a, int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right)
    {
        int pl = left; // 왼쪽 커서 초기화
        int pr = right; // 오른쪽 커서 초기화
        int x = a[(pl+pr)/2]; // 피벗을 중앙값으로 초기화

        do
        {
            while (a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr)
                swap(a, pl++, pr--);
        } while(pl <= pr);

        if(left < pr) quickSort(a, left, pr);
        if(pl < right) quickSort(a, pl, right);
    }
}
