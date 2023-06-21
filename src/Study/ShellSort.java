package Study;

import java.util.Scanner;

/*
 *  셀 정렬 (버전 1)
 *  - 단순 삽입 정렬의 장점을 살리고 단점을 보완한 정렬 알고리즘
 *  - 일정한 간격으로 서로 떨어져 있는 두 요소를 그룹으로 묶어 대략 정렬을 수행
 *  - 간격을 좁혀 그룹의 수를 줄이면서 정렬을 반복하여 요소의 이동 횟수를 줄이는 방법
 */
public class ShellSort {

    // 셀 정렬
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("셀 정렬(버전 1)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx);    // 배열 x를 셀 정렬

        System.out.println("오름차순으로 정렬 했습니다.");

        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
