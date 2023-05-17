package Lv1;

public class CodingTest08 {
    boolean solution(String str) {
        boolean answer = true;
        int cnt_pP = 0;
        int cnt_yY = 0;

        for (char s : str.toCharArray()) {
            switch (s) {
                case 'p', 'P': cnt_pP++; break;
                case 'y', 'Y': cnt_yY++; break;
                default: break;
            }
        }

        answer = cnt_pP == cnt_yY;

        return answer;
    }
    public static void main(String[] args) {
        CodingTest08 cd08 = new CodingTest08();

        System.out.println(cd08.solution("pPoooyY"));
    }
}
