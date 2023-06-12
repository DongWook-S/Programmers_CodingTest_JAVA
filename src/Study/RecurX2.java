package Study;

import java.util.Scanner;

public class RecurX2 {

    static void recur(int n) {
        InStack s = new InStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);      // n 값을 푸시
                n -= 1;
                continue;
            }
            if (s.isEmpty() != true) {  // 스택이 비어 있지 않으면
                n = s.pop();            // 저장하고 있던 스택값을 팝
                System.out.println(n);
                n -= 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        recur(x);
    }
}
