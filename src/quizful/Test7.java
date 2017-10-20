package quizful;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(2);
        array.add(5);
        array.add(6);
        array.add(1,7);
        System.out.print(array.indexOf(6));
        array.remove(1);
        System.out.println(array.indexOf(6));
    }
}
