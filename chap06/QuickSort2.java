package chap06;

/* 퀵 정렬(비재귀 버전) */

import java.util.*;

class QuickSort2
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
        // 스택 생성
        IntStack lstack = new IntStack(right-left+1);
        IntStack rstack = new IntStack(right-left+1);

        lstack.push(left);
        rstack.push(right);

        while(lstack.isEmpty() != true)
        {
            int pl = left = lstack.pop();
            int pr = right = rstack.pop();
            int x = a[(left+right)/2];

            do
            {
                while(a[pl] < x) pl++;
                while(a[pr] > x) pr--;
                if(pl<=pr)
                    swap(a, pl++, pr--);
            } while(pl<=pr);

            if(left < pr)
            {
                lstack.push(left); // 왼쪽 그룹 범위의
                rstack.push(pr); // 인덱스를 푸시
            }

            if(pl < right)
            {
                lstack.push(pl); // 오른쪽 그룹 범위의
                rstack.push(right); // 인덱스를 푸시
            }
        }
    }
}
