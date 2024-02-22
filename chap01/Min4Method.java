package chap01;

/* 네 값의 최솟값을 구하여 출력 - 메서드 사용 */

public class Min4Method 
{
    public static void main(String[] args)
    {
        System.out.println("min(1,2,3,4) = " + min4(1,2,3,4));
        System.out.println("min(4,8,5,9) = " + min4(4,8,5,9));
    }   
    
    static int min4(int a, int b, int c, int d)
    {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;
        return min;
    }
}
