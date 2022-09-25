package Structuralpatterns.AdaptorPattern;

public class CassetteTape {
    private String name;

    public CassetteTape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
