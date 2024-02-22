

public class Treadpriority {


    public static void main(String[] args){

        System.out.println("thread priority tut");

        A aa= new A();
        b bb=new b();
        c cc=new c();

        cc.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(aa.getPriority()+1);
        cc.setPriority(Thread.MIN_PRIORITY);

        System.out.println("thread A is started...");
        aa.start();
        System.out.println("thread B is started...");
        bb.start();
        System.out.println("thread C is started...");
        cc.start();

        System.out.println("Main Thread Ended");


    }
}

class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                stop(); // Pause thread execution when i equals 1
            }
            System.out.println("From Thread A: " + i);
        }
        System.out.println("Thread A is End Here...");
    }
}


class b extends Thread {
    @Override
    public void run(){
        for (int j=0;j<=5;j++){
            System.out.println("Fromg thread B"+j);
        }
        System.out.println("Thread B is End here");
    }
}

class c extends  Thread{
    @Override
    public void run(){
        for(int k=0; k<=5;k++){
            System.out.println("From thread c:  " +k);
        }
        System.out.println("Thread C is end here");
    }

}