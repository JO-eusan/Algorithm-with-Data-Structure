package chap03;

/* 선형 검색(보초법) */

import java.util.*;

class SeqSearchSen 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수:");
        int num = scanner.nextInt();
        int[] x = new int[num + 1];

        for(int i=0; i<num; i++)
        {
            System.out.print("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값:");
        int key = scanner.nextInt();

        int idx = seqSearchSen(x, num, key);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else    
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        
        scanner.close();
    }   
    
    static int seqSearchSen(int[] a, int n, int key)
    {
        int i = 0;

        a[n] = key; // 보초 추가

        while(true)
        {
            if(a[i] == key) // 검색 성공
                break;
            i++;
        }

        return i==n? -1 : i; // i가 n이 되면 검색 실패
    }
}
