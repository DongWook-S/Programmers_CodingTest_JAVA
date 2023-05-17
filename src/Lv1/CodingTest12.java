package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CodingTest12 {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        Integer[] arr = new Integer[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        return answer;
    }
    public static void main(String[] args) {
        CodingTest12 ct12 = new CodingTest12();

        System.out.println(ct12.solution(118372));
    }
}
