package AnimalRescue;

public class Dog extends Animal {

    public void eatFood() {
        System.out.println("Catelul " + getName() + " mananca.");
    }

    @Override
    public void speak() {
        System.out.println("Dog: Ham-Ham!");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Dog: I have 4 legs! ");

    }

    @Override
    public void swim() {
        System.out.println("Dog: I like to swim!");

    }

    public void executeActivity() {
        System.out.println("Catelul" + getName() + " executa activitatea " +
                this.getFavoriteActivity().getName());
    }
}
