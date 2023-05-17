package Lv1;

import java.util.Arrays;

public class CodingTest09 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        Integer strLng = str.length();

        int[] answer = new int[strLng];

        for (char c : str.toCharArray()) {
            answer[strLng - 1] =  Character.getNumericValue(c);
            strLng--;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest09 cd09 = new CodingTest09();

        System.out.println(Arrays.toString(cd09.solution(12345)));
    }
}
