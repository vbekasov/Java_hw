package hw13.opencv_tutorial.defaults;

public enum EPath {
    RESOURCES("src/main/resources/");

    private final String s;

    private EPath(String s) {
        this.s = s;
    }

    public String getVal() {
        return this.s;
    }
}
