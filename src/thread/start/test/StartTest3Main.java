package thread.start.test;

import static util.MyLogger.log;

public class StartTest3Main {

    public static void main(String[] args) {

        Thread counter = new Thread(new Runnable() {
            @Override
            public void run() {
                int value = 1;
                for (int i = 0; i < 5; i++) {
                    log("value: " + value++);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "counter");
        counter.start();
    }
}
