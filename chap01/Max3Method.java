package chap01;

/* 3개의 정숫값을 입력하고 최댓값을 구하여 출력 - 메서드 사용 */

class Max3Method 
{
    public static void main(String[] args)
    {
        System.out.println("max(3,2,1) = " + max3(3,2,1));
        System.out.println("max(3,2,2) = " + max3(3,2,2));
        System.out.println("max(3,1,2) = " + max3(3,1,2));
        System.out.println("max(3,2,3) = " + max3(3,2,3));
        System.out.println("max(2,1,3) = " + max3(2,1,3));
        System.out.println("max(3,3,2) = " + max3(3,3,2));
        System.out.println("max(3,3,3) = " + max3(3,3,3));
        System.out.println("max(2,2,3) = " + max3(2,2,3));
        System.out.println("max(2,3,1) = " + max3(2,3,1));
        System.out.println("max(2,3,2) = " + max3(2,3,2));
        System.out.println("max(1,3,2) = " + max3(1,3,2));
        System.out.println("max(2,3,3) = " + max3(2,3,3));
        System.out.println("max(1,2,3) = " + max3(1,2,3));
    }   
    
    static int max3(int a, int b, int c) // a,b,c의 최댓값을 구하여 반환하는 메서드
    {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        return max; // 구한 최댓값을 호출한 곳으로 반환
    }
}
