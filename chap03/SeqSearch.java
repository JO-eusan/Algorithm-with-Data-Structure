package chap03;

/* 선형 검색 */

import java.util.*;

class SeqSearch 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수:");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for(int i=0; i<num; i++)
        {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값:");
        int key = scanner.nextInt();
        int idx = seqSearch(x, num, key); // 배열 x에서 값이 key인 요소를 검색

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            
        scanner.close();
    }   
    
    static int seqSearch(int[] a, int n, int key)
    {
        int i = 0;

        while(true)
        {
            if(i==n)
                return -1; // 검색 실패
            if(a[i] == key)
                return i; // 검색 성공
            i++;
        }
    }
}
