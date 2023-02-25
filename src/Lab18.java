import java.util.*;
import java.io.*;

//public class Lab18 {
//    public static void main(String[] args) {
//        try {
//            File f = new File("Output.txt");
//            FileOutputStream fos = new FileOutputStream(f);
//            PrintWriter pw = new PrintWriter(fos);
////            runThreads();
////            runThreads();
//            for (int i = 1; i <= 3; i++) {
//                int threadNum = i;
//                new Thread(() -> {
//                    for (int j = 1; j <= 100; j++) {
//                        System.out.println("Thread #" + threadNum + ": " + j);
//                    }
//                }).start();
//            }
//            pw.write();
//            pw.flush();
//            fos.close();
//            pw.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//
//    public static void runThreads() {
//        for (int i = 1; i <= 3; i++) {
//            int threadNum = i;
//            new Thread(() -> {
//                for (int j = 1; j <= 100; j++) {
//                   System.out.println("Thread #" + threadNum + ": " + j);
//                }
//            }).start();
//
//        }
//    }
//}


public class Lab18 {
    public static void main(String[] args) {
        try {
            File f = new File("Output.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(fos);
            final String[] output = {""};
            for (int i = 1; i <= 3; i++) {
                int threadNum = i;
                Thread t = new Thread(() -> {
                    for (int j = 1; j <= 100; j++) {
                        output[0] += "Thread #" + threadNum + ": " + j + "\n";
                    }
                });
                t.start();
                t.join();
            }
            pw.write(output[0]);
            pw.flush();
            fos.close();
            pw.close();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            File f = new File("Output1.txt");
            FileOutputStream fos = new FileOutputStream(f);
            PrintWriter pw = new PrintWriter(fos);
            final String[] output1 = {""};
            for (int i = 1; i <= 3; i++) {
                int threadNum = i;
                Thread t = new Thread(() -> {
                    for (int j = 1; j <= 100; j++) {
                        output1[0] += "Thread #" + threadNum + ": " + j + "\n";
                    }
                });
                t.start();
                t.join();
            }
            pw.write(output1[0]);
            pw.flush();
            fos.close();
            pw.close();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
