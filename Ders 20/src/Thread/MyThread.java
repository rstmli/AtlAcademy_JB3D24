package Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Çalışıyor: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("İş parçacığı kesildi!");
        }
    }
}
