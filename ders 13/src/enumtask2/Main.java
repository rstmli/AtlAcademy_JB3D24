package enumtask2;

public class Main {
    public static void main(String[] args) {
        for(TraficLight u: TraficLight.values()){
            if(u.equals(TraficLight.RED)){
                System.out.println(u.getDescription());
            }
        }
    }
}
