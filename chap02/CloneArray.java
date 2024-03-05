package chap02;

/* 배열을 복제 */

import java.util.*;

class CloneArray 
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone(); // b는 a의 복제를 참조

        b[3] = 0;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("a = " + Arrays.toString(b));
    }    
}
