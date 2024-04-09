package chap06;

/* 정렬을 마친 배열의 병합 */

import java.util.*;

class MergeArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] a = {2, 4, 6, 8, 11, 13};
        int[] b = {1, 2, 3, 4, 8, 16, 21};
        int[] c = new int[13];

        System.out.println("두 배열을 병합");
        merge(a, a.length, b, b.length, c); // 배열 a와 b를 병합하여 c에 저장

        System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");

        System.out.println("배열 a: ");
        for(int i=0; i<a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
        
        System.out.println("배열 b: ");
        for(int i=0; i<b.length; i++)
            System.out.println("b[" + i + "] = " + b[i]);

        System.out.println("배열 c: ");
        for(int i=0; i<c.length; i++)
            System.out.println("c[" + i + "] = " + c[i]);
        
        scanner.close();
    }    

    // 정렬을 마친 배열 a, b를 병합하여 배열c에 저장
    static void merge(int[] a, int na, int[] b, int nb, int[] c)
    {
        int pa = 0;
        int pb = 0;
        int pc = 0;

        while(pa<na && pb<nb)
            c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
        
        while(pa<na) // a에 남아 있는 요소를 복사
            c[pc++] = a[pa++];
        
        while(pb<nb) // b에 남아 있는 요소를 복사
            c[pc++] = b[pb++];
    }
}
