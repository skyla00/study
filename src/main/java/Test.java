class Car implements Runnable{
    int a;

    @Override
    public void run() {
        try {
            while (++a < 100) {
                System.out.println("miles traveled :" + a );
                Thread.sleep(100);
            }
        } catch (Exception E ) { }
    }
}

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car());
        t1.start();
    }
}
