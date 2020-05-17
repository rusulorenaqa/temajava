package AnimalRescue;

public class Duck extends Animal{
    public void fly(){
        System.out.println("I'm " + getName()+ " and I'm flying");
    }
    public void eatFood() {
        System.out.println("Rata " + getName() + " mananca.");
    }
    public void executeActivity(){
        System.out.println("Rata " + getName() + " executa activitatea " +
                this.getFavoriteActivity().getName());
    }
}
