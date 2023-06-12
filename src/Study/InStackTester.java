package Study;

import java.util.Scanner;

public class InStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        InStack s = new InStack(64);    // 최대 64를 푸시할 수 있는 스택

        while(true) {
            System.out.println();   // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시    (2) 팝    (3) 피크    (4) 덤프    (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;

            if (menu == 1) {        // 푸시
                System.out.print("데이터 : ");
                x = stdIn.nextInt();

                try {
                    s.push(x);
                } catch (InStack.OverflowInStackException e) {
                    System.out.println("스택이 가득 찼습니다.");
                }
            }
            else if (menu == 2) {   // 팝
                try {
                    x = s.pop();
                    System.out.println("팝한 데이터는 " + x + "입니다.");
                } catch (InStack.EmptyIntStackException e) {
                    System.out.println("스택이 비어 있습니다.");
                }
            }
            else if (menu == 3) {   // 피크
                try {
                    x = s.peek();
                    System.out.println("피크한 데이터는 " + x + "입니다.");
                } catch (InStack.EmptyIntStackException e) {
                    System.out.println("스택이 비어 있습니다.");
                }
            }
            else if (menu == 4) {   // 덤프
                s.dump();
            }
        }
    }
}
