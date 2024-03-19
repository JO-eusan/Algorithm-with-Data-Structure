package chap04;

/* int형 고정 길이 스택의 사용 예 */

import java.util.Scanner;

class IntStackTest 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택 생성

        while(true)
        {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프  (0) 종료: ");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            int x;
            switch(menu)
            {
                case 1: // 푸시
                    System.out.print("데이터 ");
                    x = scanner.nextInt();
                    try
                    {
                        s.push(x);
                    }
                    catch(IntStack.OverflowIntStackException e)
                    {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2: // 팝
                    try
                    {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    }
                    catch(IntStack.EmptyIntStackException e)
                    {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3: // 피크
                    try
                    {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    }
                    catch(IntStack.EmptyIntStackException e)
                    {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4: // 덤프
                    s.dump();
                    break;
            }
        }
        
        scanner.close();
    }
}
