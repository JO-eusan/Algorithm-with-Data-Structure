package chap02;

/* 1000 이하의 소수를 나열 */

class PrimeNumver1 
{
    public static void main(String[] args)
    {
        int counter = 0; // 나눗셈의 횟수

        for(int n=2; n<=1000; n++)
        {
            int i;
            for(i=2; i<n; i++)
            {
                counter++;
                if(n%i == 0)
                    break; // 나누어 떨어지면 소수가 아니므로 반복 중단.
            }

            if(n==i)
                System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }    
}
