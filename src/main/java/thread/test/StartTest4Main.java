package thread.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Print runnableA = new Print("A", 1000);
        Print runnableB = new Print("B", 500);

        Thread threadA = new Thread(runnableA, "Thread-A");
        Thread threadB = new Thread(runnableB, "Thread-B");
        threadA.start();
        threadB.start();

    }

    static class Print implements Runnable {

        private String content;
        private Integer sleepMs;

        public Print(String content, Integer sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
