//implementing Hi and Hello classes functionalities
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        Runnable obj1 = ;
//
//        Runnable obj2 = ;

//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        t1.start();
        t2.start();

    }

}