package Lv1;

public class CodingTest04 {
    public String solution(int num) {
        String answer = "";

        answer = num % 2 == 0 ? "Even" : "Odd";

        return answer;
    }
    public static void main(String[] args) {
        CodingTest04 cd04 = new CodingTest04();

        System.out.println(cd04.solution(5));
    }
}
