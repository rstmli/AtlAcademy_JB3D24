package comparible;

public class Employee implements Comparable<Employee> {
    private String name;
    private Integer sallary;
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sallary=" + sallary +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSallary() {
        return sallary;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String name, Integer sallary, Integer age) {
        this.name = name;
        this.sallary = sallary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.getName().compareTo(emp.getName());
    }
}
