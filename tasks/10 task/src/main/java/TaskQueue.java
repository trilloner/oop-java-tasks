import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    private Queue<Runnable> taskList = new LinkedList<>();
    private boolean terminated = false;


    TaskQueue() {}

    public synchronized Runnable take() throws InterruptedException {
        if (terminated && taskList.isEmpty()) {
            return null;
        }
        while (taskList.isEmpty()) {
            wait();
            notifyAll();
        }
        Runnable task = taskList.poll();
        return task;
    }

    public synchronized void put(Runnable task) throws InterruptedException {
        taskList.add(task);
        notifyAll();
    }

    public synchronized void setTerminated(boolean terminated) {
        this.terminated = terminated;
        notifyAll();
    }
}
