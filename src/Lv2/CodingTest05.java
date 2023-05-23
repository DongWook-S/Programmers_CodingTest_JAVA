package Lv2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CodingTest05 {
    /*
     * input : 110010101001 / output : {3, 8}
     * 1. x 의 0 을 다 제거
     * 2. 111111(0 제거 후 길이 6 / 제거 한 0의 개수 6) -> 110
     *    자릿수를 2진법으로 계산(6자리 -> 110)
     * 3. 110(0 제거 후 길이 2 / 제거한 0의 개수 1) -> 10
     * 4. 10(0 제거 후 길이 1 / 제거한 0의 개수 1)
     */
    private int binaryCnt = 1;
    private int[] array = new int[2];
    private String result = "";
    public int[] solution(String s) {
        return f_result(s);
    }
    public int[] f_result(String s) {
        int binaryValue = 0; // 2진수 결과값
        int initCnt = 0;

        String binaryStr = "";
        String resultStr = "";

        result = s.chars()
                .filter(c -> c != '0')
                .mapToObj(Character::toString)
                .collect(Collectors.joining());

        while(true) {
            int quotient  = initCnt == 0 ? result.length() / 2 : binaryValue / 2;
            int remainder = initCnt == 0 ? result.length() % 2 : binaryValue % 2;

            binaryValue = quotient;

            binaryStr += remainder;

            initCnt++;

            if (binaryValue == 0) break;
        }

        for (int i = binaryStr.length(); i > 0; i--) {
            resultStr += binaryStr.substring(i - 1, i);
        }

        array[0] = binaryCnt++;
        array[1] += s.length() - result.length();

        if (result.length() <= 1) return array;

        return f_result(resultStr);
    }
    public static void main(String[] args) {
        CodingTest05 ct05 = new CodingTest05();

//        System.out.println(Arrays.toString(ct05.solution("01110")));
        System.out.println(Arrays.toString(ct05.solution("110010101001")));
    }
}
