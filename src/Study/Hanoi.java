package Study;

import java.util.Scanner;

/*
 *  하노이의 탑
 * ----------------------------------------------------------
 *  입력값 : 3
 * ----------------------------------------------------------
 *  move(3, 1, 3) - {1, 2, 3} 을 첫번째 기둥에서 세번째 기둥으로
 * ----------------------------------------------------------
 *  move(2, 1, 2) - {1, 2}    을 첫번째 기둥에서 두번째 기둥으로
 * ----------------------------------------------------------
 *  move(1, 1, 3) - {1}       을 첫번째 기둥에서 세번째 기둥으로
 *                - 원반[1]을 첫번째 기둥에서 세번째 기둥으로 옮김
 *                - 원반[2]을 첫번째 기둥에서 두번째 기둥으로 옮김
 * ----------------------------------------------------------
 *  move(1, 3, 2) - {1}       을 세번째 기둥에서 두번째 기둥으로
 *                - 원반[1]을 세번째 기둥에서 두번째 기둥으로 옮김
 *                - 원반[2]을 첫번째 기둥에서 세번째 기둥으로 옮김
 * ----------------------------------------------------------
 *  move(2, 2, 3) - {1, 2}    을 두번째 기둥에서 세번째 기둥으로
 * ----------------------------------------------------------
 *  move(1, 2, 1) - {1}       을 두번째 기둥에서 첫번째 기둥으로
 *                - 원반[1]을 두번째 기둥에서 첫번째 기둥으로 옮김
 *                - 원반[2]을 두번째 기둥에서 세번째 기둥으로 옮김
 * ----------------------------------------------------------
 *  move(1, 1, 3) - {1}       을 첫번째 기둥에서 세번째 기둥으로
 *                - 원반[1]을 첫번째 기둥에서 세번째 기둥으로 옮김
 * ----------------------------------------------------------
 */
public class Hanoi {

    // no 개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = stdIn.nextInt();

        // 1번 기둥에 쌓임 n 개의 원반을 3번 기둥으로 옮김
        move(n, 1, 3);
    }
}