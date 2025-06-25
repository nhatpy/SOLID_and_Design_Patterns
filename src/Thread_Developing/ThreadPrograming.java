package Thread_Developing;

public class ThreadPrograming {
    class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println("MyThread is running");
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadPrograming().new MyThread());
        thread.start();
    }
}
