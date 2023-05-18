package Lv1;

import java.util.Arrays;

public class CodingTest20 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int minNum = arr[0];
        int cnt = 0;

        if (arr.length == 1) {
            int[] reArray = {-1};
            return reArray;
        }

        for (int i = 0; i < arr.length; i++) {
            minNum = Math.min(minNum, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (minNum != arr[i]) {
                answer[cnt++] = arr[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest20 ct20 = new CodingTest20();

        int[] array = {4, 3, 2, 1};
        //int[] array = {10};

        System.out.println(Arrays.toString(ct20.solution(array)));
    }
}
