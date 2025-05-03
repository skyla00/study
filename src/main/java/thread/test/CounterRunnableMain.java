package thread.test;

public class CounterRunnableMain {
    public static void main(String[] args) {
        CounterRunnable counterRunnable = new CounterRunnable();
        // 스레드 이름을 지정할 수 있음.
        Thread thread = new Thread(counterRunnable, "counter");
        thread.start();
    }
}
