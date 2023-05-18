package Lv1;

public class CodingTest18 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            answer += signs[i] == true ? absolutes[i] : absolutes[i] * -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest18 ct18 = new CodingTest18();

        int[] array01 = {4, 7, 12};
        boolean[] array02 = {true, false, true};

        System.out.println(ct18.solution(array01, array02));
    }
}
