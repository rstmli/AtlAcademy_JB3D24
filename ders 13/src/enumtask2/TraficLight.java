package enumtask2;

public enum TraficLight {
    RED("dayan"),
    YELLOW("hazirlas"),
    GREEN("get");
    private final String description;

    TraficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

