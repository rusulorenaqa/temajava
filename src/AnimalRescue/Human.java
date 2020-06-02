package AnimalRescue;

public abstract class Human {
    private String name;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public abstract void doJob();

}
