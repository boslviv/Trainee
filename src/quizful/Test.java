package quizful;



public class Test {
    public static void main(String[] args) { //2
      boolean toBe = true||false;
      PrinceOfDenmark hamlet = new PrinceOfDenmark();
      hamlet.totureYourSelf(toBe || !toBe);

    }
}
class PrinceOfDenmark {
    void totureYourSelf(boolean mind){
        if(mind){
            System.out.println("I will hate everybody including myself");
        }
        else {
            System.out.println("I will be a good citizen.");
        }
    }
}
