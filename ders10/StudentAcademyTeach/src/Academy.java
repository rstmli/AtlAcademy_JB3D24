public class Academy {


    private String academyName;
    private String address;


    public void setName(String name) {
        this.academyName = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  String getName(){
        return academyName;
    }
    public String getAddress(){
        return address;
    }

    public Academy(String academyName, String address){
        this.academyName = academyName;
        this.address = address;

    }

    public Academy(){

    }
    public void displayInfo(){
        System.out.print("adi: : " + academyName +" address " + address + " ");
    }


}
