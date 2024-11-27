package task3;

public enum Season {
    WINTER("soyuq fesildir",5,-5),
    SUMMER("isti fesil",50,30),
    AUTUMN("kulekli",15,20),
    SPRING("normal",20,30);
    private final String description;
    private final int maxTemperator;
    private final int minTemperator;
//    private final String getFormatInfo;

    public String getDescription() {
        return description;
    }

    public int getMaxTemperator() {
        return maxTemperator;
    }

    public int getMinTemperator() {
        return minTemperator;
    }


    Season(String description, int maxTemperator, int minTemperator) {
        this.description = description;
        this.maxTemperator = maxTemperator;
        this.minTemperator = minTemperator;
    }
    public String getFormatInfo() {
        return String.format("%s: %d minumum temperature C Max temperature %d C (%s)",
                this.name(),this.minTemperator,this.maxTemperator,this.description);
    }

}
