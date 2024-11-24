package Abstract;

abstract class Fiqurlar {
//    abstract void fiqurlar();

//    void printText(){
//        System.out.println("her biri Fiqurdur");
//    }

    public String name;
    public int line;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }


    public Fiqurlar(String name, int line) {
        this.name = name;
        this.line = line;
    }


    @Override
    public String toString() {
        return name + " " + line;
    }
}
