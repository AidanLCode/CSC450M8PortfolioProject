public class Main {
    public static void main(String[] args) {
        // Create the first thread to execute the count up function
        Thread thread1 = new Thread(new CountUp());

        // Start the first thread
        thread1.start();

        // Wait for thread1 to finish
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create the second thread to execute the count down function
        Thread thread2 = new Thread(new CountDown());

        // Start the second thread
        thread2.start();

        // Wait for thread2 to finish
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Runnable class for counting up
class CountUp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Count Up: " + i);
            try {
                Thread.sleep(500); // sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable class for counting down
class CountDown implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("Count Down: " + i);
            try {
                Thread.sleep(500); // sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
