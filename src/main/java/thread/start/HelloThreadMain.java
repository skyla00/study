package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        HelloThread helloThread = new HelloThread();
        System.out.println(thread.getName() + " : start 호출 전 ");
        // start()를 호출하면 helloThread 가 run()메서드를 호출.
        // main 스레드는 start()를 통해 helloTheard 한테 run() 을 명령함.
        // helloTheard 의 실행을 기다리지 않음. 실행 순서를 보장하지 않음. >> 멀티스레드!
        helloThread.start();
        System.out.println(thread.getName() + " : start 호출 후 ");

        System.out.println(thread.getName() + " : main() end ");

        // 실행 결과
        // main : start 호출 전
        // main : start 호출 후
        // main : main() end
        // Thread-0: run()



    }
}
