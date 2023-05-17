package Lv1;

import java.util.Arrays;

public class CodingTest07 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int num = 0;

        for (int i = 1; i <= n; i++) {
            //num += x;
            //answer[i] = Long.valueOf(num);
            //answer[num] = Long.valueOf(i * x);
            answer[num] = (long)i * x;
            num++;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest07 cd07 = new CodingTest07();

        System.out.println(Arrays.toString(cd07.solution(-4, 2)));
    }
}
