package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1 = " + thread.getState());
        log("myThread.start()");
        thread.start();

        Thread.sleep(1000);
        log("myThread.state3 = " + thread.getState()); // time_waiting

        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState()); // terminated
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
                log("start");
                Thread thread = Thread.currentThread();
                log("myThread.state2 = " + thread.getState()); // runnable

            try {
                Thread.sleep((3000));
                log("myThread.state4 = " + thread.getState()); // runnable

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
