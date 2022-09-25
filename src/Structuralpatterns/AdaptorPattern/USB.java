package Structuralpatterns.AdaptorPattern;

public class USB {
    private String name;

    public USB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
