package chap06;

/* 퀵 정렬(개선) */

import java.util.*;

public class QuickSort3 
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
    
    static void swap(int a[], int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // x[a], x[b], x[c] 정렬
    static int sort3elem(int[] x, int a, int b, int c)
    {
        if(x[b] < x[a]) swap(x, b, a);
        if(x[c] < x[b]) swap(x, c, b);
        if(x[b] < x[a]) swap(x, b, a);
        return b;
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right)
    {
        int pl = left;
        int pr = right;
        int m = sort3elem(a, pl, (pl+pr)/2, pr); // 처음, 가운데, 끝 요소를 정렬
        int x = a[m]; // 피벗

        swap(a, m, right-1); // 가운데 요소와 끝에서 두 번재 요소를 교환
        pl++; // 커서 이동
        pr -= 2;

        do
        {
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;

            if(pl <= pr)
                swap(a, pl++, pr--);
        } while(pl<=pr);

        if(left < pr) quickSort(a, left, pr);
        if(pl < right) quickSort(a, pl, right);
    }
}
