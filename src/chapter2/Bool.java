package chapter2;

import java.util.Random;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(9  ); // не зрозумів чому і як міняється генерування випадкового числа
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = "+i);
        System.out.println("j = "+j);

    }
}
