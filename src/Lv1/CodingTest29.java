package Lv1;

import java.util.Arrays;

public class CodingTest29 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int cnt = 1;

        while (true) {
            if (answer[0] > 0 && answer[1] > 0) break;

            if (n % cnt == 0 && m % cnt == 0) answer[0] = cnt; // 최소 공배수
            if (cnt % n == 0 && cnt % m == 0) answer[1] = cnt; // 최대 공약수

            cnt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest29 ct29 = new CodingTest29();

        System.out.println(Arrays.toString(ct29.solution(3, 12)));
    }
}
