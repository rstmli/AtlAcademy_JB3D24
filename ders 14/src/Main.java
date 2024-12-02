public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Proqram başladığı zaman: " + startTime + " millisaniyə");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Proqram bitdiyi zaman: " + endTime + " millisaniyə");
        long duration = endTime - startTime;
        System.out.println("Proqramın işləmə müddəti: " + duration + " millisaniyə");
    }
}
