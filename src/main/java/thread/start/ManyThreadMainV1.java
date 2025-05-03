package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

        // 스레드 3개를 생성할 때 모두 같은 HelloRunnable 인스턴스를 스레드의 실행작업으로 전달.
        // 세 스레드는 모두 HelloRunnable 인스턴스에 있는 run() 메서드를 실행함.

        log("main() end");

    }
}
