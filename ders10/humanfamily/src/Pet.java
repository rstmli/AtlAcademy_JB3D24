public class Pet extends Human {

    private String name;
    private int yas;

    public void setName(String name) {
        this.name = name;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getName() {
        return name;
    }

    public int getYas() {
        return yas;
    }

    public Pet(){

    }


    public Pet(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }



}
