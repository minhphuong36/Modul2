public class RunnableDemo implements Runnable {
    private Thread t;
    private final  String threadName;
    RunnableDemo(String name){
        threadName = name;
        System.out.println("Đang tạo "+ threadName);
    }


    @Override
    public void run() {
        System.out.println("Đang tạo "+threadName);
        try {
            for (int i = 4; i  >0; i--) {
                System.out.println("Thread: "+ threadName+", "+i);
//                Dùng vòng lặp 50ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e){
            System.out.println("Thread "+ threadName + "interrupted");
        }
        System.out.println("Thread " + threadName +" exiting.");
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
