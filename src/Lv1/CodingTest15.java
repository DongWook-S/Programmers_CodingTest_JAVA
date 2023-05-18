package Lv1;

import java.util.Arrays;

public class CodingTest15 {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;

        for (String s : seoul) {
            if (s.equals("Kim")) {
                answer = "김서방은 " + cnt + "에 있다";
            }
            cnt++;
        }

        return answer;
        //return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
    public static void main(String[] args) {
        CodingTest15 ct15 = new CodingTest15();

        String[] strArray = {"Jane", "Kim"};

        System.out.println(ct15.solution(strArray));
    }
}
