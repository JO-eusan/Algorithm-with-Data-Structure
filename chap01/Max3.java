package chap01;

/* 3개의 정숫값을 입력하고 최댓값을 구하여 출력 */

import java.util.*;

public class Max3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값: "); int a = scanner.nextInt();
        System.out.print("b의 값: "); int b = scanner.nextInt();
        System.out.print("c의 값: "); int c = scanner.nextInt();

        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;

        System.out.println("최댓값은 " + max + "입니다.");

        scanner.close();
    }    
}
