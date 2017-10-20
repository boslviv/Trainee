package chapter2;

    // Демонструє порядок ініциалізації

    class Window {
        Window(int market){
            System.out.println("Window(" + market + ")");
        }
    }

    class House {
        Window w1 = new Window(1); // перед конструктором

        House() {
            // Показуэ що працюэ конструктор
            System.out.println("House()");
            w3 = new Window(33);
        }

        Window w2 = new Window(2); // після конструктора
        void f() { System.out.println("f()"); }
        Window w3 = new Window(3);
    }

    public class OrderOfInitialization {
        public static void main(String[] args) {
            House h = new House();
            h.f();
        }
    }

