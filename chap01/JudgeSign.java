package chap01;

/* 입력한 정숫값의 부호(양수/음수/0)을 판단 */

import java.util.Scanner;

class JudgeSign 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt();

        if(n > 0)
            System.out.println("이 수는 양수입니다.");
        else if(n < 0)
            System.out.println("이 수는 음수입니다.");
        else // n=0
            System.out.println("이 수는 0입니다.");
        
        scanner.close();
    }
}
