
class MyThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<4) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4){
            System.out.println("my thread 2 is Running");
            System.out.println(" i ma very sad");
            i++;
        }
    }
}

public class MultiThreadingExample{



public static void main(String[] args) {


    System.out.println("hello world");

    MyThread1 t1= new MyThread1();
    Mythread2 t2=new Mythread2();

    t1.start();
    t2.start();



















}
}