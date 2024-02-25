package chap01;

/* 네 값의 최댓값을 구하여 출력 - 메서드 사용 */

class Max4Method 
{
    public static void main(String[] args)
    {
        System.out.println("max(1,2,3,4) = " + max4(1,2,3,4));
        System.out.println("max(3,1,4,7) = " + max4(3,1,4,7));
    }   
    
    static int max4(int a, int b, int c, int d)
    {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        if(d > max)
            max = d;
        return max;
    }
}
