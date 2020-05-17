package AnimalRescue;

public class Cat extends Animal{

    public void eatFood() {
        System.out.println("Pisica " + getName() + " mananca.");
    }
    public void executeActivity(){
        System.out.println("Pisica " + getName() + " executa activitatea " +
                this.getFavoriteActivity().getName());
    }
}
