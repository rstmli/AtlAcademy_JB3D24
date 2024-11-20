public class Academy {


    private String name;
    private String surname;
    private String address;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    public Academy(String name,String surname, String address){
        this.name = name;
        this.surname = surname;
        this.address = address;

    }

    public Academy(){

    }
    public void displayInfo(){
        System.out.print("adi: : " + name + " Soyadi: " + name +" address " + address + " ");
    }


}
