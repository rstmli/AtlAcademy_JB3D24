package equals;

import java.util.Objects;

public class Student {
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
