package Lv1;

import java.util.Arrays;

public class CodingTest33 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (d[i] > budget) break;
            budget -= d[i];
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest33 ct33 = new CodingTest33();

        //int[] arr = {1, 3, 2, 5, 4};
        int[] arr = {2, 2, 3, 3};

        System.out.println(ct33.solution(arr, 10));
    }
}
