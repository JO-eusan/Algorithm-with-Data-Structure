package chap02;

/* 구성 요소의 자료형이 int형인 배열 */

class IntArray 
{
    public static void main(String[] args)
    {
        int[] a = new int[5]; // 배열의 선언

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for(int i=0; i<a.length; i++) // 각 요소를 출력
            System.out.println("a[" + i + "] = " + a[i]);
    }    
}
