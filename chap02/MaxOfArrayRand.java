package chap02;

/* 배열 요소의 최댓값을 출력(값을 난수로 생성) */

import java.util.*;

class MaxOfArrayRand 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수:");
        int num = scanner.nextInt();

        int[] height = new int[num];

        System.out.println("키는 아래와 같습니다.");
        for(int i=0; i<num; i++)
        {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]:" + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
        
        scanner.close();
    }    

    static int maxOf(int[] a)
    {
        int max = a[0];
        for(int i=1; i<a.length; i++)
            if(a[i] > max) max = a[i];
        return max;
    }
}
