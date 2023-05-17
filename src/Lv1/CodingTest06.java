package Lv1;

public class CodingTest06 {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        char[] charArray = new char[String.valueOf(x).length()];
        int num = 0;
        int sum = 0;

        for (char s : str.toCharArray()) {
            charArray[num] = s;
            num++;
        }

        for (int i = 0; i < charArray.length; i++) {
            sum += Character.getNumericValue(charArray[i]);
        }

        return x % sum == 0;
    }

    /*
     * 람다식 풀이(chat GPT)
     * int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
       String.valueOf(x)를 통해 정수 x를 문자열로 변환합니다.
       chars() 메소드는 문자열을 문자 스트림으로 변환합니다. 스트림은 데이터 요소의 시퀀스를 나타내며,
       각 문자는 개별 요소로 취급됩니다.
     * map(ch -> ch - '0')는 각 문자를 정수로 변환합니다. 여기서 ch - '0'은 문자의 아스키 코드 값을 정수 값으로
       변환하는 방식입니다. 예를 들어, '9'의 아스키 코드 값은 57이고,
       '0'의 아스키 코드 값은 48이므로, ch - '0'은 문자 '9'를 정수 9로 변환합니다.
       sum()은 스트림의 모든 요소를 합산합니다. 따라서, 이 코드는 x의 각 자리 숫자의 합을 계산하여 sum 변수에 저장합니다.
     * return x % sum == 0;
       x를 sum으로 나눈 나머지(x % sum)를 계산합니다.
       x % sum == 0은 x를 sum으로 나눈 나머지가 0인지 확인하는 조건식입니다.
       이 조건식의 결과에 따라 true 또는 false를 반환합니다. 즉, x의 각 자리 숫자의 합으로 x를 나눌 수 있는지를 확인합니다.
     */
    public boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
    public static void main(String[] args) {
        CodingTest06 ct06 = new CodingTest06();

        System.out.println(ct06.solution(10));
        System.out.println(ct06.solution2(10));
    }
}
