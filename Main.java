/*Create 5 threads and print "Hello All" using Thread class */

import java.io.*;

class ThreadNaming extends Thread {

  @Override
  public void run() {
    System.out.println("Hello All");
  }
}

class Main {

  public static void main(String[] args) {
    ThreadNaming t1 = new ThreadNaming();
    ThreadNaming t2 = new ThreadNaming();
    ThreadNaming t3 = new ThreadNaming();
    ThreadNaming t4 = new ThreadNaming();
    ThreadNaming t5 = new ThreadNaming();

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}
