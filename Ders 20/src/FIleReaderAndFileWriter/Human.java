package FIleReaderAndFileWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Human {

  private String name;
  private String surname;
  private Integer age;

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Human{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Human(String name, String surname, Integer age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public static void main(String[] args) throws IOException {
    String pathFile = "Oracle.txt";
    BufferedReader reader = new BufferedReader(new FileReader(pathFile));
    String line;
    List<Human> mylist = new ArrayList<>();
    while((line = reader.readLine()) != null){
      String[] mylist2 = line.split(" ");
      if(mylist2.length ==3){
        String name = mylist2[0];
        String surname = mylist2[1];
        String age = mylist2[2];
        mylist.add(new Human(name,surname,Integer.valueOf(age)));
      }
    }

    for(Human human : mylist){
      System.out.println(human);
    }
  }
}





