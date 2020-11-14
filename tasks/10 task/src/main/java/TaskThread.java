public class TaskThread extends Thread{
    private TaskQueue queue;

    public TaskThread(int id, TaskQueue queue) {
        this.queue = queue;
        setName("pool-thread-No." + id);

    }

    @Override
    public void run() {
        try {
            while (true) {
                Runnable task = queue.take();
                if (task == null) {
                    break;
                }
                task.run();
            }
        } catch (InterruptedException e) {
        }
    }
}
