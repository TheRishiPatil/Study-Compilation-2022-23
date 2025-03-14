package Core_Java_Topics.Thread;

class ExtendedThread extends Thread{

    ExtendedThread(String name) {
        super(name);
    }

    public void run(){
        System.out.println("ExtendedThread");
    }
}

class RunnableInterface implements Runnable {
    public void run(){
        System.out.println("RunnableInterface");
    }
}

public class basic {
    public static void main(String[] args) throws InterruptedException {
        ExtendedThread obj = new ExtendedThread("Rishi");
        obj.start();
        System.out.println(obj.threadId());
        System.out.println(obj.getName());

        RunnableInterface obj2 = new RunnableInterface();
        Thread t1 = new Thread(obj2, "Rishi");
        t1.start();
        System.out.println(t1.threadId());
        System.out.println(t1.getName());
    }
}
