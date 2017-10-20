package quizful;

public class QTest {
    {
        System.out.print("1");
    }

    public static void main(String[] args) {
        System.out.print("2");
        new QTest();
    }
    static {
        System.out.print("3");
    }
}
