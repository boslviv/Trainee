package chapter2;

public class WhileTest {

    static int countStatic = 0;
    int  count = 0;
    static boolean condition (){
        System.out.println(++countStatic+ " спроба");

        double i = Math.random();
        System.out.println("i = "+i);

        boolean result = i < 0.999;
        System.out.print(result + ". ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while' ");
        System.out.println("exited 'while' ");
    }
}
