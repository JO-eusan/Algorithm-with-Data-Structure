package chap01;

/* +와 -를 번갈아 출력(2) */

import java.util.Scanner;

class Alternative2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값:");
        int n = scanner.nextInt();

        for(int i=0; i<n/2; i++)
            System.out.print("+-");
        if(n%2 != 0) // 홀수이면 뒤에 + 추가
            System.out.print("+");

        scanner.close();
    }    
}
