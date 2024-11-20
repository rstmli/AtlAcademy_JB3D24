public class Pet extends Main {
    public Pet(){

    }
    public Pet(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    private String species;
    private  String nickname;
    private  int age;
    private  int trickLevel;


    public String toString() {
        return "Pet : " + nickname + ", " + age;
    }



}
