package Lv2;

import java.util.Arrays;
import java.util.Collections;

public class CodingTest03 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);

        Integer[] re_B = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(re_B, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * re_B[i];
        }

        return (Integer)answer;
    }
    public static void main(String[] args) {
        CodingTest03 ct03 = new CodingTest03();

//        int[] arrayA = {1, 4, 2};
//        int[] arrayB = {5, 4, 4};
        int[] arrayA = {1, 2};
        int[] arrayB = {3, 4};

        System.out.println(ct03.solution(arrayA, arrayB));
    }
}
