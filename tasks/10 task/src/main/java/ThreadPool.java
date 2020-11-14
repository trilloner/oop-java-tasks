

public class ThreadPool implements ExecutorService{
    private Thread[] threads;
    private TaskQueue queue = new TaskQueue();

    public ThreadPool(int threadNum) {
        threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            threads[i] = new TaskThread(i + 1, queue);
            threads[i].start();
        }
    }

    @Override
    public void execute(Runnable task) {
        if (task == null) {
            throw new IllegalArgumentException("task is null!");
        }
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void shutDown() {
        queue.setTerminated(true);
    }
}
