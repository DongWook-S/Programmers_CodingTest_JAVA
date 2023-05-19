package Lv1;

import java.util.Arrays;
import java.util.Comparator;

public class CodingTest24 {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");

        Arrays.sort(strArr, Comparator.reverseOrder());

        for (String str : strArr) {
            answer += str;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest24 ct24 = new CodingTest24();

        System.out.println(ct24.solution("Zbcdefg"));
    }
}
