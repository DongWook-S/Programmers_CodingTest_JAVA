package Lv1;

import java.util.Arrays;

public class CodingTest19 {
    public int solution(int[] numbers) {
        int answer = 0;

        //Arrays.sort(numbers);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) break;
                if (j == numbers.length - 1) answer += i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest19 ct19 = new CodingTest19();

        //int[] array = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] array = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(ct19.solution(array));
    }
}
