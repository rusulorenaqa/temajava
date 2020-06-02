package AnimalRescue;

public class Duck extends Animal {
    public void fly() {
        System.out.println("I'm " + getName() + " and I'm flying");
    }

    public void eatFood() {
        System.out.println("Rata " + getName() + " mananca.");
    }

    @Override
    public void speak() {
        System.out.println("Duck: Mac-Mac! ");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Duck: I have 2 legs! ");

    }

    @Override
    public void swim() {
        System.out.println("Duck: I'm floating on water! ");

    }

    public void executeActivity() {
        System.out.println("Rata " + getName() + " executa activitatea " +
                this.getFavoriteActivity().getName());
    }
}
