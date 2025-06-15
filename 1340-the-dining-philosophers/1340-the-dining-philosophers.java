import java.util.concurrent.locks.ReentrantLock;

class DiningPhilosophers {
    private final ReentrantLock mutex = new ReentrantLock();

    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {

        mutex.lock();
        try {
            pickLeftFork.run();
            pickRightFork.run();
            eat.run();
            putLeftFork.run();
            putRightFork.run();
        } finally {
            mutex.unlock();
        }
    }
}
