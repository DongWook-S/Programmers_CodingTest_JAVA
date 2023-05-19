package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CodingTest28 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest28 ct28 = new CodingTest28();

        int[][] array01 = {{1, 2}, {2, 3}};
        int[][] array02 = {{3, 4}, {5, 6}};

        System.out.println(Arrays.toString(ct28.solution(array01, array02)));
    }
}
