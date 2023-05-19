package Lv1;

public class CodingTest26 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            int num = i * price;
            answer += num;
        }

        return answer <= money ? 0 : answer - money;
        //return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
    public static void main(String[] args) {
        CodingTest26 ct26 = new CodingTest26();

        System.out.println(ct26.solution(3, 20, 4));
    }
}
