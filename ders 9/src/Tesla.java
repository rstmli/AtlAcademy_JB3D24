public class Tesla extends CarMain {
    public Tesla(){
        System.out.println("--------- Tesla xüsusiyyətləri ---------");
        System.out.println(electricalTechnology());
        System.out.println(highPerformance());
    }
    private String electricalTechnology(){
        return "Tesla 100% elektriklə işləyən avtomobillər istehsal edir.";
    }
    private String highPerformance(){
        return "Tesla avtomobilləri çox sürətli və performanslıdır.";
    }
}
