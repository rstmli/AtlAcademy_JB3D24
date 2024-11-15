public class NumberSum {
    public static void main(String[] args) {
        int i = 1;
        int cem = 0;
        do{
            cem = i+cem;
            System.out.println(cem);
            i++;
        }while(i<=10);
        System.out.print("1-ilə 10 arasiındakı ədədlərin cəmi: " + cem);
    }
}
