package Lv1;

public class CodingTest12 {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        Integer[] arr = new Integer[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        // Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String value = "";

        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }

        answer = Long.valueOf(value);

        return answer;
    }
    public static void main(String[] args) {
        CodingTest12 ct12 = new CodingTest12();

        System.out.println(ct12.solution(118372));
    }
}
