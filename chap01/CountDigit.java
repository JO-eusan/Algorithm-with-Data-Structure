package chap01;

/* 양의 정수의 자릿수 count */

import java.util.Scanner;

class CountDigit 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count_digit = 0;
        for(int i=1; n/i != 0; i *= 10)
            count_digit++;
        
        System.out.print(count_digit);
        
        scanner.close();
    }    
}
