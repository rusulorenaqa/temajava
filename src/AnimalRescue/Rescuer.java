package AnimalRescue;

public class Rescuer extends Human {

    private float money;

    public void setMoney(float newMoney) {
        this.money = newMoney;
    }

    public float getMoney() {
        return money;
    }

    @Override
    public void doJob() {
        System.out.println("Rescuer: I'm adopting animals! ");
    }
}
