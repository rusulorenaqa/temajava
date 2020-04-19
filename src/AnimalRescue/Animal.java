package AnimalRescue;

public class Animal {
    public String name;
    public int age;
    public int health;
    public int hunger;
    public int joy;
    public Food favoriteFood;
    public Activity favoriteActivity;

    public void executeActivity() {
        System.out.println("Animalul numit " + this.name + " executa activitatea " +
                this.favoriteActivity.name);
        joy = joy + 1;
        System.out.println("Noul nivel de joy pentru " + this.name + " este: " + joy);
    }

    public void eatFood() {
        System.out.println("Animalul " + this.name + " mananca.");
        hunger = hunger - 1;
        favoriteFood.quantity = favoriteFood.quantity - 1;
        System.out.println("Noul nivel de hunger al animalului " + this.name + " este: " + hunger);
        System.out.println("Cantitatea de mancare ramasa pentru " + this.name +
                " este: " + favoriteFood.quantity);
    }
}
