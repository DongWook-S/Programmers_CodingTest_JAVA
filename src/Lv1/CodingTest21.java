package Lv1;

public class CodingTest21 {
    public String solution(String s) {
        int share = s.length() / 2;
        int remain = s.length() % 2;

        return remain == 0 ? s.substring(share - 1, share + 1) : s.substring(share, share + 1);
    }
    public static void main(String[] args) {
        CodingTest21 ct21 = new CodingTest21();

        System.out.println(ct21.solution("qwer"));
    }
}
