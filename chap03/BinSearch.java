package chap03;

/* 이진 검색 */

import java.util.*;

class BinSearch 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수:");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]:"); // 첫 요소 입력 받음
        x[0] = scanner.nextInt();

        for(int i=1; i<num; i++)
        {
            do
            {
                System.out.print("x[" + i + "]:");
                x[i] = scanner.nextInt();
            } while(x[i] < x[i-1]); // 바로 앞 요소보다 작으면 다시 입력 받음
        }

        System.out.print("검색할 값:");
        int key = scanner.nextInt();

        int idx = binSearch(x, num, key);

        if(idx == -1) // 검색 실패
            System.out.println("그 값의 요소가 없습니다.");
        else // 검색 성공
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");

        scanner.close();
    }   
    
    // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색하는 메서드
    static int binSearch(int[] a, int n, int key)
    {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n-1; // 검색 범위의 끝 인덱스

        do
        {
            int pc = (pl+pr) / 2; // 중앙 요소 인덱스는 계속 업데이트
            if(a[pc] == key)
                return pc; // 검색 성공
            else if(a[pc] < key)
                pl = pc + 1; // 검색 범위 좁힘
            else if(a[pc] > key)
                pr = pc - 1; // 검색 범위 좁힘
        } while(pl <= pr);

        return -1; // 검색 실패
    }
}
