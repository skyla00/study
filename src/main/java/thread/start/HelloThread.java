package thread.start;

public class HelloThread extends Thread {

    @Override
    public void run() {
        // thread 클래스 상속, 스레드가 실행할 코드를 run() 메서드에 재정의
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
