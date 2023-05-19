package Lv1;

public class CodingTest27 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) return false;

        try {
            Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return false;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest27 ct27 = new CodingTest27();

        System.out.println(ct27.solution("a234"));
    }
}
