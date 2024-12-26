package FlatMapTask;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Phon> phonList;

    public Person(String name, List<Phon> phonList) {
        this.name = name;
        this.phonList = phonList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phon> getPhonList() {
        return phonList;
    }

    public void setPhonList(List<Phon> phonList) {
        this.phonList = phonList;
    }
}
