package USA_Practice.MultiThreading;

// class A implements Runnable {
//     public void run() {
//         try {
//             for (int i = 0; i < 4; i++) {
//                 Thread.sleep(100);
//                 System.out.println(Thread.currentThread().getName());
//             }
//         } catch (InterruptedException e) {
//         }
//     }
// }

// public class Test {
//     public static void main(String argv[]) throws Exception {
//         A a = new A();
//         Thread t = new Thread(a);
//         t.setName("A");
//         Thread t1 = new Thread(a, "B");
//         t.start();
//         t.join();
//         t1.start();
//     }
// }

// class A extends Thread {
// public void run() {
// for (int i = 0; i < 2; i++) {
// System.out.println(i);
// }
// }
// }

// public class Test {
// public static void main(String argv[]) {
// Test t = new Test();
// t.check(new A() {});
// }
// public void check(A a) {
// a.start();
// }
// }

public class Test extends Thread {
    private int i = 10;

    public void run() {
        i++;
        i++;
    }

    public static void main(String[] args) {
        Test a = new Test();
        a.run();
        System.out.print(a.i);
        a.start();
        System.out.print(a.i);
    }
}