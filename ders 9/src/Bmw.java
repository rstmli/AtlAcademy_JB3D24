public class Bmw extends CarMain {
    public Bmw(){
        System.out.println("--------- Bmw xüsusiyyətləri ---------");
        System.out.println(dynamicDriving());
        System.out.println(externalDesign());
        System.out.println(intellectualTechnologies());
        System.out.println(suitablePrice());
    }
    private String dynamicDriving(){
        return "BMW, sürüş keyfiyyəti və idarəetmə ilə məşhurdur.";
    }
    private String externalDesign(){
        return "BMW-nin xarici dizaynı çox vaxt kəskin və iddialıdır.";
    }
    private String intellectualTechnologies(){
        return "BMW, sürücünün avtomobili daha rahat və təhlükəsiz idarə etməsini təmin edir.";
    }
    private String suitablePrice(){
        return "BMW, premium avtomobillər arasında orta və yüksək qiymət aralığında yerləşir.";
    }

}
