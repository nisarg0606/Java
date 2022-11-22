package USA_Practice;

class newthread extends Thread {
    Thread t1, t2;

    newthread() {
        t1 = new Thread(this, "one");
        t2 = new Thread(this, "one");
        t1.start();
        t2.start();
    }

    public void run() {
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.equals(t2));
        System.out.print(t1.getName() + " " + t1.getPriority() + " ");
        System.out.println(t2.getName() + " " + t2.getPriority());
    }
}

class multithreaded_programing {
    public static void main(String args[]) {
        new newthread();
    }
}