package quizful;

class Super {
    Super(){
        System.out.println("Supe cotructor");
    }
}

public class Main1 extends Super {
    Main1(){
        this(1);
        System.out.println("Main() contructor");
    }
    Main1(int i){
        System.out.println("Main(int) contructor");
    }

    public static void main(String[] args) {
        new Main1();
    }
}
