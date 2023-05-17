package Lv1;

public class CodingTest14 {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;

        if (num == 1) return 0;

        while(true) {

            if (num % 2 == 0)
            {
                num /= 2;
            }
            else if (num % 2 == 1)
            {
                num = (num * 3) + 1;
            }

            cnt++;

            if (cnt >= 500 || num == 1) break;
        }

        return num == 1 ? cnt : -1;
    }
    public static void main(String[] args) {
        CodingTest14 ct14 = new CodingTest14();

        System.out.println(ct14.solution(1));
    }
}
