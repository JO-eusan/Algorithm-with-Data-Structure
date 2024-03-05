package chap02;

/* 1000 이하의 소수를 나열 */

class PrimeNumber2 
{
    public static void main(String[] args)
    {
        int counter = 0;
        int ptr = 0; // 배열에 저장된 소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 소수이므로 저장

        for(int n=3; n<=1000; n+=2) // 홀수만 조사
        {
            int i;
            for(i=1; i<ptr; i++)
            {
                counter++;
                if(n%prime[i] == 0)
                    break; // 나누어 떨어지면 소수가 아님
            }

            if(ptr==i)
                prime[ptr++] = n; // 소수는 배열에 저장
        }

        for(int i=0; i<ptr; i++)
            System.out.println(prime[i]);
        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }    
}
