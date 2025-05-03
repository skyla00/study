package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "main() start");

        // 작업
        HelloRunnable runnable = new HelloRunnable();

        // 작업과 스레드를 분리하는 것
        // 스레드 객체를 생성할 때 실행할 작업을 생성자로 전달함
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(Thread.currentThread().getName() + "main() end");
    }
}
