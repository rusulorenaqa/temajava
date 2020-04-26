package AnimalRescue;

public class Rescuer {
    private String name;
    private float money;

    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return name;
    }
    public void setMoney(float newMoney){
        this.money = newMoney;
    }
    public float getMoney(){
        return money;
    }
}
