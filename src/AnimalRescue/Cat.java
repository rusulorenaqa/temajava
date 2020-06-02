package AnimalRescue;

public class Cat extends Animal {

    public void eatFood() {
        System.out.println("Pisica " + getName() + " mananca.");
    }

    @Override
    public void speak() {
        System.out.println("Cat: Meow! ");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Cat: I have 4 legs! ");

    }

    @Override
    public void swim() {
        System.out.println("Cat: I don't like to swim!");

    }

    public void executeActivity() {
        System.out.println("Pisica " + getName() + " executa activitatea " +
                this.getFavoriteActivity().getName());
    }
}
