package EnumTaskWeek;

public class Main {
    public static void main(String[] args) {
        Week week = Week.WEDNESDAY;
//        var day = Week.values();
        switch (week){
            case MONDAY : {
                System.out.println("Bazartesidi");
                break;
            }
            case TUESDAY :{
                System.out.println("Cersenme axsami");
                break;
            }
            case WEDNESDAY : {
                System.out.println("cersenbe");
                break;
            }
            case THURSDAY : {
                System.out.println("Cersenbe axsami");
                break;
            }
            case FRIDAY: {
                System.out.println("cume");
                break;
            }
            case SATURDAY:{
                System.out.println("SENBE");
                break;
            }
            case SUNDAY: {
                System.out.println("BAZAR");
                break;
            }
        }
    }

}
