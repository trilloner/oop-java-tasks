public class Executors {
    public static ExecutorService newThreadPool(int threadNum) {
        return new ThreadPool(threadNum);
    }
}
