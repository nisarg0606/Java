// package USA_Practice.MultiThreading;

// class A extends Thread {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             if(i == 1) yield();
//             System.out.println("\tFrom A : i = " + i);
//         }
//         System.out.println("Exiting from A....");
//     }
// }

// class B extends Thread {
//     @Override
//     public void run() {
//         for (int j = 1; j <= 5; j++) {
//             System.out.println("\tFrom B : i = " + j);
//             if(j == 3)
//                 stop();
//         }
//         System.out.println("Exiting from B....");
//     }
// }

// class C extends Thread {
//     @Override
//     public void run() {
//         for (int j = 1; j <= 5; j++) {
//             System.out.println("\tFrom C : i = " + j);
//             if(j == 1)
//             try {
//                 sleep(1000);
//             } catch (Exception e) {
//             }
//         }
//         System.out.println("Exiting from C....");
//     }
// }

// public class YieldSleepStop {

//     public static void main(String[] args) {
//         A threadA = new A(); 
//         B threadB = new B(); 
//         C threadC = new C();
        
//         System.out.println("Start Thread A");
//         threadA.start();
//         System.out.println("Start Thread B");
//         threadB.start();
//         System.out.println("Start Thread C");
//         threadC.start();
//         System.out.println("End of Main Thread");
        
        

//     }


    
// }
