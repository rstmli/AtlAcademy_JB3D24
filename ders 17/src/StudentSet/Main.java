package StudentSet;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Student ilkin = new Student("Ilkin",1);
        Student huseyn = new Student("Huseyn",2);
        Student emin = new Student("Emin",2);

       try{
           register.add(ilkin);
           register.add(huseyn);
           register.add(emin);
           register.showStudent();
           register.searchStudent("Ilkin");
       }catch (SearchNotFoundException | NoStudentstoshowException e){
           System.out.println(e.getMessage());
       }
    }



}
