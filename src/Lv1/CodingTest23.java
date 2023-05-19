package Lv1;

import java.util.stream.IntStream;

public class CodingTest23 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
        //return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
    public static void main(String[] args) {
        CodingTest23 ct23 = new CodingTest23();
        int[] array01 = {1, 2, 3, 4};
        int[] array02 = {-3, -1, 0, 2};

        System.out.println(ct23.solution(array01, array02));
    }
}
