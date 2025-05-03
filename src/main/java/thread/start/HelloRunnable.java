package thread.start;

public class HelloRunnable implements Runnable{

    // implement 이므로 구현해야 함.

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
