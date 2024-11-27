package EnumTest;

enum Colors {
    RED("This color is red"),
    GREEN("This color is green"),
    YELLOW("This color is yellow");

    private final String description;

    public String getDescription() {
        return description;
    }

    Colors(String description) {
        this.description = description;
    }
}
