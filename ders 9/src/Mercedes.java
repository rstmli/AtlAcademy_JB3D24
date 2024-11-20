public class Mercedes extends CarMain {
    public Mercedes(){
        System.out.println("--------- Mercedes xüsusiyyətləri ---------");
        System.out.println(comfort());
        System.out.println(additionalSafety());
        System.out.println(highTechnology());
        System.out.println(innovationEcology());
    }
    private String comfort(){
        return "Mercedes, bütün dünyada lüks və komfortlu avtomobilləri ilə tanınır. ";
    }
    private String additionalSafety(){
        return "Mercedes, yüksək təhlükəsizlik xüsusiyyətləri ilə də məşhurdur.";
    }
    private String highTechnology(){
        return "Mercedes'in MBUX infoteynment sistemi çox inkişaf etmişdir və səsli əmrlərlə idarə oluna bilər.";
    }
    private String innovationEcology(){
        return "Mercedes, ekoloji cəhətdən təmiz və gələcəyin avtomobilləri olan EQ seriyası ilə tanınır.";
    }
}