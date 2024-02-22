package chap01;

/* 세 값의 최솟값을 구하여 출력 - 메서드 사용 */

public class Min3Method 
{
    public static void main(String[] args)
    {
        System.out.println("min(1,2,3) = " + min3(1,2,3));
        System.out.println("min(4,2,6) = " + min3(4,2,6));
    }   
    
    static int min3(int a, int b, int c)
    {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        return min;
    }
}
