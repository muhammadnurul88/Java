class Display {
    public synchronized void display() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }



    static class MyThread1 extends Thread {
        Display d;

        MyThread1(Display d) {
            this.d = d;
        }
        public void run() {
            d.display();
        }
    }

    static class MyThread2 extends Thread {
        Display d;

        MyThread2(Display d) {
            this.d = d;
        }
        public void run() {
            d.display();
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Display d = new Display();
        Display.MyThread1 t1 = new Display.MyThread1(d);
        Display.MyThread2 t2 = new Display.MyThread2(d);
        t1.start();
        t2.start();
    }
}
