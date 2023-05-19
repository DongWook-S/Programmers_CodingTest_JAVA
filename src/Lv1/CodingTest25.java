package Lv1;

import java.util.ArrayList;

public class CodingTest25 {
    /*
        짝수 : 덧셈 / 홀수 : 뺄셈

        13 -> 1, 13             : 2
        14 -> 1, 2, 7, 14       : 4
        15 -> 1, 3, 5, 15       : 4
        16 -> 1, 2, 4, 8, 16    : 5
        17 -> 1, 17             : 2

        13 + 14 + 15 - 16 + 17 = 43
    */
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            ArrayList<Integer> arrayList = new ArrayList();
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    arrayList.add(j);
                }
            }
            answer = arrayList.size() % 2 == 0 ? answer + i : answer - i;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest25 ct25 = new CodingTest25();

        System.out.println(ct25.solution(13, 17));
    }
}
