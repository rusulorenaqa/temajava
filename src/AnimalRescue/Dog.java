package AnimalRescue;

public class Dog extends Animal{

    public void eatFood() {
        System.out.println("Catelul " + getName() + " mananca.");
    }
    public void executeActivity(){
        System.out.println("Catelul" + getName() + " executa activitatea " +
                this.getFavoriteActivity().getName());
    }
}
