package Lv1;

public class CodingTest06 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        CodingTest06 cd06 = new CodingTest06();

        System.out.println(cd06.solution(10));
    }
}
