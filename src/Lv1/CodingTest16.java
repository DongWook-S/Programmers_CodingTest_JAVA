package Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTest16 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
                cnt++;
            }
        }

        answer = new int[cnt];
        cnt = 0;

        for (Integer temp : arrayList) {
            answer[cnt++] = temp;
        }

        for (int i = 0; i < answer.length; i+=1) {
            for (int j = i; j < answer.length; j++) {
                if (answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest16 ct16 = new CodingTest16();

        int[] intArray = {3, 2, 6};

        System.out.println(Arrays.toString(ct16.solution(intArray, 10)));
    }
}
