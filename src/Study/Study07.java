package Study;

import java.util.Scanner;

/*
 * 선형 검색 OR 순차 검색
 * 요소가 직선 모양으로 늘어선 배열에서 검색은 원하는 키값을
 * 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색
 */
public class Study07 {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1; // 검색 실패 (-1을 반환)
            }
            if (a[i] == key) {
                return i; // 검색 성공 (인덱스를 반환)
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
