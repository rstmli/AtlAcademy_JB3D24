public class returnTask {
    public static void main(String[] args) {
        System.out.println(menumUchunChapaVer("Huseyn","rustemli",18));



    }
    public static boolean menumUchunChapaVer(String name,String surname,int age){
        if(age<18){
            return true;
        }
        for(int i = 0;i<age;i++){
            System.out.println("HELLO");
            if(i==5){
                return true;
            }
        }
        System.out.println("Hello");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println("________________");
        System.out.println("Size nece komek ede bilerem...?");
        return false;
    }
}
