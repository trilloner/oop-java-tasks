import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newThreadPool(5);

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            service.execute(
                    () -> {
                for (int j = 0; j < 100000; j++) {

                }
                System.out.println("Name:   " + Thread.currentThread().getName() + " task : " + finalI + " done！");
            }
            );

        }

        service.shutDown();
    }
}
