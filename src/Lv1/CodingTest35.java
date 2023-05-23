package Lv1;

public class CodingTest35 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (0 == number[i] + number[j] + number[k]) answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        CodingTest35 ct35 = new CodingTest35();

        int[] array = {-2, 3, 0, 2, -5};

        System.out.println(ct35.solution(array));
    }
}
