package Study;

class Id {
    private static int counter = 0; // 아이디를 몇개 부여했는지 저장 (클랙스 변수)
    private int id;                 // 아이디 (인스턴스 변수)

    // 생성자
    public Id() {
        id = ++counter;
    }

    // counter를 변환하는 클래스 메서드
    public static int getCounter() {
        return counter;
    }

    // 아이디를 변환하는 인스턴드 메소드
    public int getId() {
        return id;
    }
}
public class Study10 {
    public static void main(String[] args) {
        Id a = new Id(); // 아이디1
        Id b = new Id(); // 아이디2

        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
    }
}
