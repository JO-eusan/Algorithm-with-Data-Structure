package chap06;

/* 단순 선택 정렬 */

import java.util.Scanner;

class SelectionSort 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("단순 선택 정렬");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++)
        {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        selectionSort(x,nx); // 배열 x를 단순 선택 정렬

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

    /* 단순 선택 정렬 */
    static void selectionSort(int[] a, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            int min = i; // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장
            for(int j=i+1; j<n; j++)
            {
                if(a[j] < a[min])
                    min = j;
            }
            swap(a, i, min); // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
        }
    }
}
