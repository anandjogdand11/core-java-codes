public class synchronization {

        public static void main(String[] args) {
            SharedResource sharedResource = new SharedResource();

            // Create and start the threads
            MyThread thread1 = new MyThread("Thread 1", sharedResource);
            MyThread thread2 = new MyThread("Thread 2", sharedResource);
            thread1.start();
            thread2.start();
        }
    }

    class SharedResource {
        // Synchronized method
        public synchronized void performOperation(String threadName) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + threadName + " - Operation " + i);
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class MyThread extends Thread {
        private String threadName;
        private SharedResource sharedResource;

        public MyThread(String threadName, SharedResource sharedResource) {
            this.threadName = threadName;
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            sharedResource.performOperation(threadName);
        }
    }
